// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

/* 
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
*/

import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.rollerConstants;

public class rollerSubsystem extends SubsystemBase {

    private final TalonSRX rollerMotor;
   
    public rollerSubsystem () {

    //rollerMotor = new SparkMax(rollerConstants.ROLLER_MOTOR_ID, MotorType.kBrushed)
    rollerMotor = new TalonSRX(rollerConstants.ROLLER_MOTOR_ID);

    rollerMotor.configFactoryDefault();

    // Set can timeout. Because this project only sets parameters once on
    // construction, the timeout can be long without blocking robot operation. Code
    // which sets or gets parameters during operation may need a shorter timeout.
    //rollerMotor.setCANTimeout(250);

    // Create and apply configuration for roller motor. Voltage compensation helps
    // the roller behave the same as the battery
    // voltage dips. The current limit helps prevent breaker trips or burning out
    // the motor in the event the roller stalls.
    
    /*     
    SparkMaxConfig rollerConfig = new SparkMaxConfig();
    rollerConfig.voltageCompensation(rollerConstants.ROLLER_MOTOR_VOLTAGE_COMP);
    rollerConfig.smartCurrentLimit(rollerConstants.ROLLER_MOTOR_CURRENT_LIMIT);
    rollerConfig.idleMode(IdleMode.kBrake);
    rollerMotor.configure(rollerConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    */

    rollerMotor.configVoltageCompSaturation(rollerConstants.ROLLER_MOTOR_VOLTAGE_COMP);
    rollerMotor.enableVoltageCompensation(true);
    rollerMotor.configContinuousCurrentLimit(rollerConstants.ROLLER_MOTOR_CURRENT_LIMIT);
    rollerMotor.configPeakCurrentLimit(rollerConstants.ROLLER_MOTOR_CURRENT_LIMIT + 5);
    rollerMotor.configPeakCurrentDuration(100);
    rollerMotor.enableCurrentLimit(true);
    rollerMotor.setNeutralMode(NeutralMode.Brake);
}

    @Override
    public void periodic() {
    }

    /**
     *  This is a method that makes the roller spin to your desired speed.
     *  Positive values make it spin forward and negative values spin it in reverse.
     * 
     * @param speedmotor speed from -1.0 to 1, with 0 stopping it
     */
    public void runRoller(double speed){
        rollerMotor.set(ControlMode.PercentOutput,speed);
    }
}
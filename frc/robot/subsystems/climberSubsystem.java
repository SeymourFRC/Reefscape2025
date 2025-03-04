// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.climberConstants;

public class climberSubsystem extends SubsystemBase {

  private final SparkMax climbMotor;

  public climberSubsystem() {

  climbMotor = new SparkMax(climberConstants.CLIMBER_MOTOR_ID, MotorType.kBrushless);

  climbMotor.setCANTimeout(250);

  SparkMaxConfig climbConfig = new SparkMaxConfig();
  climbConfig.voltageCompensation(climberConstants.CLIMBER_MOTOR_VOLTAGE_COMP);
  climbConfig.smartCurrentLimit(climberConstants.CLIMBER_MOTOR_CURRENT_LIMIT);
  climbConfig.idleMode(IdleMode.kBrake);
  climbMotor.configure(climbConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void runClimber(double speed){
    climbMotor.set(speed);
  }
}

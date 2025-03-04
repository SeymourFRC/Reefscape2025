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
import frc.robot.Constants.armConstants;

public class armSubsystem extends SubsystemBase {

  private final SparkMax armMotor;

  public armSubsystem() {
  
  armMotor = new SparkMax(armConstants.ARM_MOTOR_ID, MotorType.kBrushed);

  armMotor.setCANTimeout(250);

  SparkMaxConfig armConfig = new SparkMaxConfig();
  armConfig.voltageCompensation(10);
  armConfig.smartCurrentLimit(armConstants.ARM_MOTOR_CURRENT_LIMIT);
  armConfig.idleMode(IdleMode.kBrake);
  armMotor.configure(armConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
  }

  

  @Override
  public void periodic() {
  } 
  public void runArm(double speed){
    armMotor.set(speed);
  }
}
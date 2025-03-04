// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Commands;

import frc.robot.Constants.armConstants;
import frc.robot.subsystems.armSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

/** An ArmDown command that uses an Arm subsystem. */
public class armDown extends Command {
  private final armSubsystem m_arm;

  /**
   * Powers the arm down, when finished passively holds the arm down.
   * 
   * We recommend that you use this to only move the arm into the paracord
   * and let the passive portion hold the arm down.
   *
   */
  public armDown(armSubsystem arm) {
    m_arm = arm;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(arm);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_arm.runArm(armConstants.ARM_SPEED_DOWN);
  }

  // Called once the command ends or is interrupted.
  // Here we run arm down at low speed to ensure it stays down
  // When the next command is caled it will override this command
  @Override
  public void end(boolean interrupted) {
    m_arm.runArm(armConstants.ARM_HOLD_DOWN);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Commands;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.Constants.rollerConstants;
import frc.robot.subsystems.rollerSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */


public class algaeIntake extends Command {
  private final rollerSubsystem m_roller;
  public algaeIntake(rollerSubsystem roller) {
    m_roller = roller;
    addRequirements(roller);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    m_roller.runRoller(rollerConstants.ROLLER_ALGAE_IN);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_roller.runRoller(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
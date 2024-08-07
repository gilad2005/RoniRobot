// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Intake;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class SetIntakePower extends InstantCommand {
  private Intake m_intake;
  private double m_precent;
  public SetIntakePower(Intake intake, double precent) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(intake);
    m_intake = intake;
    m_precent = precent;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_intake.setMotorPrecent(m_precent);
  }
}

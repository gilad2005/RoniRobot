// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.DisableIntakeMotor;
import frc.robot.commands.SetIntakePower;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandPS5Controller;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {

  CommandPS5Controller controller = new CommandPS5Controller(0);
  Intake intake = new Intake();
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    controller.cross().onTrue(new SetIntakePower(intake, 0.3));
    controller.square().onTrue(new SetIntakePower(intake, 0.7));
    controller.circle().onTrue((new DisableIntakeMotor(intake)));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  private CANSparkFlex intakeMotor;
  public Intake() {
    intakeMotor = new CANSparkFlex(Constants.intakeMotorID, MotorType.kBrushless);
    intakeMotor.setSmartCurrentLimit(40);
    intakeMotor.setInverted(false);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setMotorPrecent(double precent){
    intakeMotor.set(precent);
  }

  public void disableMotor(){
    intakeMotor.disable();
  }
}

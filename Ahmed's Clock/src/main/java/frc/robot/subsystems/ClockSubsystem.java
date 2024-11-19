// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.configs.CurrentLimitsConfigs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClockSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private final TalonFX falconspinny;
  public ClockSubsystem() {
    falconspinny = new TalonFX(0);
    TalonFXConfiguration talonFXConfiguration = new TalonFXConfiguration();
  }

  public void setMotor(double speed){
    if(Math.abs(speed) > 0.05){
      System.out.println(speed);
      falconspinny.set(speed);
    }else{
      falconspinny.set(0);
    }
    SmartDashboard.putNumber("RPM", falconspinny.getVelocity().getValueAsDouble() * 60);
    SmartDashboard.putNumber("Current", falconspinny.getSupplyCurrent().getValueAsDouble());
  }
}

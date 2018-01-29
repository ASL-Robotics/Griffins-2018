/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1884.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	// Drivetrain
	// declare Drivetrain motors
	public static TalonSRX DRIVETRAIN_MOTOR_FL, DRIVETRAIN_MOTOR_BL, DRIVETRAIN_MOTOR_FR, DRIVETRAIN_MOTOR_BR;

	// Intake
	// declare Intake motors
	public static VictorSP INTAKE_MOTOR_L, INTAKE_MOTOR_R;

	// declare Intake solenoid
	public static DoubleSolenoid INTAKE_PISTON;

	// Elevator
	// Declare + initialize Elevator motor
	public static TalonSRX ELEVATOR_MOTOR;

	public static DoubleSolenoid ELEVATOR_PISTON;

	// Climber
	// declare + initialize Climber motor
	public static VictorSP CLIMBER_MOTOR;

	// declare + initialize Climber piston
	public static DoubleSolenoid CLIMBER_PISTON;

	// Flipper
	// declare + initialize Flipper solenoids
	public static DoubleSolenoid FLIPPER_L, FLIPPER_R;

	public static void init() {
		// Initialize Drivetrain motors
		DRIVETRAIN_MOTOR_FL = new TalonSRX(0);
		DRIVETRAIN_MOTOR_BL = new TalonSRX(1);
		DRIVETRAIN_MOTOR_BL.follow(DRIVETRAIN_MOTOR_FL);

		DRIVETRAIN_MOTOR_FR = new TalonSRX(2);
		DRIVETRAIN_MOTOR_BR = new TalonSRX(3);
		DRIVETRAIN_MOTOR_BR.follow(DRIVETRAIN_MOTOR_FR);

		INTAKE_MOTOR_L = new VictorSP(0);
		INTAKE_MOTOR_R = new VictorSP(1);

		INTAKE_PISTON = new DoubleSolenoid(0, 1);

		ELEVATOR_MOTOR = new TalonSRX(4);

		ELEVATOR_PISTON = new DoubleSolenoid(2, 3);

		CLIMBER_MOTOR = new VictorSP(2);
		CLIMBER_PISTON = new DoubleSolenoid(4, 5);

		FLIPPER_L = new DoubleSolenoid(6, 7);
		FLIPPER_R = new DoubleSolenoid(8, 9);
	}

}

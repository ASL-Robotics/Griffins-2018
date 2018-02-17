/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1884.robot;

import org.usfirst.frc.team1884.robot.commands.autocommands.CrossLine;
import org.usfirst.frc.team1884.robot.commands.autocommands.DoNothing;
import org.usfirst.frc.team1884.robot.commands.autocommands.LeftToLeftScale;
import org.usfirst.frc.team1884.robot.commands.autocommands.LeftToLeftSwitch;
import org.usfirst.frc.team1884.robot.commands.autocommands.LeftToRightScale;
import org.usfirst.frc.team1884.robot.commands.autocommands.LeftToRightSwitch;
import org.usfirst.frc.team1884.robot.commands.autocommands.MiddleToLeftScale;
import org.usfirst.frc.team1884.robot.commands.autocommands.MiddleToLeftSwitch;
import org.usfirst.frc.team1884.robot.commands.autocommands.MiddleToRightScale;
import org.usfirst.frc.team1884.robot.commands.autocommands.MiddleToRightSwitch;
import org.usfirst.frc.team1884.robot.commands.autocommands.RightToLeftScale;
import org.usfirst.frc.team1884.robot.commands.autocommands.RightToLeftSwitch;
import org.usfirst.frc.team1884.robot.commands.autocommands.RightToRightScale;
import org.usfirst.frc.team1884.robot.commands.autocommands.RightToRightSwitch;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.VelocityMeasPeriod;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static SendableChooser LOCATION_CHOOSER, AUTO_CHOOSER;

	// Drivetrain
	// declare Drivetrain motors
	public static TalonSRX DRIVETRAIN_MOTOR_FL, DRIVETRAIN_MOTOR_BL, DRIVETRAIN_MOTOR_FR, DRIVETRAIN_MOTOR_BR;

	// Intake
	// declare Intake motors
	public static VictorSP INTAKE_MOTOR_L, INTAKE_MOTOR_R;

	// declare Intake solenoid
	public static DoubleSolenoid INTAKE_HORIZONTAL_PISTON, INTAKE_VERTICAL_PISTON;

	// Elevator
	// Declare + initialize Elevator motor
	public static TalonSRX ELEVATOR_MOTOR;

	public static DoubleSolenoid ELEVATOR_PISTON;

	public static DigitalInput ELEVATOR_SWITCH;

	// Climber
	// declare + initialize Climber motor
	public static VictorSP CLIMBER_CLIMB_MOTOR;

	// declare + initialize Climber piston
	public static VictorSP CLIMBER_DEPLOY_MOTOR;

	// Flipper
	// declare + initialize Flipper solenoids
	public static Solenoid FLIPPER_L, FLIPPER_R;

	public static void init() {

		LOCATION_CHOOSER = new SendableChooser();
		LOCATION_CHOOSER.addDefault("Left", 'l');
		LOCATION_CHOOSER.addObject("Middle", 'm');
		LOCATION_CHOOSER.addObject("Right", 'r');
		SmartDashboard.putData("Location:", LOCATION_CHOOSER);

		AUTO_CHOOSER = new SendableChooser();
		AUTO_CHOOSER.addDefault("Do Nothing", "doNothing");
		AUTO_CHOOSER.addDefault("Auto Line", "autoLine");
		AUTO_CHOOSER.addObject("Switch", "switch");
		AUTO_CHOOSER.addObject("Scale", "scale");
		SmartDashboard.putData("AUTO:", AUTO_CHOOSER);

		// Initialize Drivetrain motors
		DRIVETRAIN_MOTOR_FL = new TalonSRX(0);
		DRIVETRAIN_MOTOR_FL.setInverted(true);
		DRIVETRAIN_MOTOR_FL.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 10);
		DRIVETRAIN_MOTOR_FL.setSensorPhase(true);
		DRIVETRAIN_MOTOR_FL.configVelocityMeasurementPeriod(VelocityMeasPeriod.Period_100Ms, 10);
		DRIVETRAIN_MOTOR_FL.configVelocityMeasurementWindow(1, 10);
		DRIVETRAIN_MOTOR_FL.changeMotionControlFramePeriod(4);
		DRIVETRAIN_MOTOR_FL.configNeutralDeadband(0.001, 10);
		DRIVETRAIN_MOTOR_BL = new TalonSRX(1);
		DRIVETRAIN_MOTOR_BL.setInverted(true);
		DRIVETRAIN_MOTOR_BL.configNeutralDeadband(0.001, 10);
		DRIVETRAIN_MOTOR_BL.follow(DRIVETRAIN_MOTOR_FL);

		DRIVETRAIN_MOTOR_FR = new TalonSRX(2);
		DRIVETRAIN_MOTOR_FR.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 10);
		DRIVETRAIN_MOTOR_FR.setSensorPhase(true);
		DRIVETRAIN_MOTOR_FR.configVelocityMeasurementPeriod(VelocityMeasPeriod.Period_100Ms, 10);
		DRIVETRAIN_MOTOR_FR.configVelocityMeasurementWindow(1, 10);
		DRIVETRAIN_MOTOR_FR.changeMotionControlFramePeriod(4);
		DRIVETRAIN_MOTOR_FR.configNeutralDeadband(0.001, 10);
		DRIVETRAIN_MOTOR_BR = new TalonSRX(3);
		DRIVETRAIN_MOTOR_BR.configNeutralDeadband(0.001, 10);
		DRIVETRAIN_MOTOR_BR.follow(DRIVETRAIN_MOTOR_FR);

		INTAKE_MOTOR_L = new VictorSP(0);
		INTAKE_MOTOR_R = new VictorSP(1);

		INTAKE_HORIZONTAL_PISTON = new DoubleSolenoid(0, 1);
		INTAKE_VERTICAL_PISTON = new DoubleSolenoid(2,3);

		ELEVATOR_MOTOR = new TalonSRX(4);
		ELEVATOR_MOTOR.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);

		ELEVATOR_PISTON = new DoubleSolenoid(4, 5);

		ELEVATOR_SWITCH = new DigitalInput(0);

		CLIMBER_CLIMB_MOTOR = new VictorSP(2);
		CLIMBER_DEPLOY_MOTOR = new VictorSP(3);

		FLIPPER_L = new Solenoid(6);
		FLIPPER_R = new Solenoid(7);
	}

	public static Command getAutoCommand() {
		char location = (char) LOCATION_CHOOSER.getSelected();
		String auto = (String) AUTO_CHOOSER.getSelected();
		String gameData = DriverStation.getInstance().getGameSpecificMessage();
		char allianceSwitch = gameData.length() > 0 ? gameData.charAt(0) : 0;
		char scale = gameData.length() > 0 ? gameData.charAt(1) : 0;

		Command autoCommand = null;

		if (auto.equals("doNothing")) {
			autoCommand = new DoNothing();
		} else if (auto.equals("autoLine")) {
			autoCommand = new CrossLine();
		} else if (auto.equals("switch")) {
			if (location == 'l') {
				if (allianceSwitch == 'L') {
					autoCommand = new LeftToLeftSwitch();
				} else if (allianceSwitch == 'R') {
					autoCommand = new LeftToRightSwitch();
				}
			} else if (location == 'm') {
				if (allianceSwitch == 'L') {
					autoCommand = new MiddleToLeftSwitch();
				} else if (allianceSwitch == 'R') {
					autoCommand = new MiddleToRightSwitch();
				}
			} else if (location == 'r') {
				if (allianceSwitch == 'L') {
					autoCommand = new RightToLeftSwitch();
				} else if (allianceSwitch == 'R') {
					autoCommand = new RightToRightSwitch();
				}
			}
		} else if (auto.equals("scale")) {
			if (location == 'l') {
				if (scale == 'L') {
					autoCommand = new LeftToLeftScale();
				} else if (allianceSwitch == 'R') {
					autoCommand = new LeftToRightScale();
				}
			} else if (scale == 'm') {
				if (allianceSwitch == 'L') {
					autoCommand = new MiddleToLeftScale();
				} else if (allianceSwitch == 'R') {
					autoCommand = new MiddleToRightScale();
				}
			} else if (scale == 'r') {
				if (allianceSwitch == 'L') {
					autoCommand = new RightToLeftScale();
				} else if (allianceSwitch == 'R') {
					autoCommand = new RightToRightScale();
				}
			}
		}

		return autoCommand;

	}

}

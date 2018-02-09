/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1884.robot;

import org.usfirst.frc.team1884.robot.commands.autocommands.CrossLineLeft;
import org.usfirst.frc.team1884.robot.commands.autocommands.CrossLineRight;
import org.usfirst.frc.team1884.robot.commands.autocommands.DoNothing;
import org.usfirst.frc.team1884.robot.commands.autocommands.LeftToLeft;
import org.usfirst.frc.team1884.robot.commands.autocommands.LeftToRight;
import org.usfirst.frc.team1884.robot.commands.autocommands.MiddleToLeft;
import org.usfirst.frc.team1884.robot.commands.autocommands.MiddleToRight;
import org.usfirst.frc.team1884.robot.commands.autocommands.RightCrossLineMiddle;
import org.usfirst.frc.team1884.robot.commands.autocommands.RightToLeft;
import org.usfirst.frc.team1884.robot.commands.autocommands.RightToRight;
import org.usfirst.frc.team1884.robot.subsystems.Climber;
import org.usfirst.frc.team1884.robot.subsystems.Drivetrain;
import org.usfirst.frc.team1884.robot.subsystems.Elevator;
import org.usfirst.frc.team1884.robot.subsystems.Flipper;
import org.usfirst.frc.team1884.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {
	Command autonomousCommand;
	SendableChooser autoChooser;
	public static OI m_oi;
	public static Flipper flipper;
	public static Climber climber;
	public static Intake intake;
	public static Drivetrain drivetrain;
	public static Elevator elevator;

	/**
	 * This function is run when the robot is first started up and should be used
	 * for any initialization code.
	 */
	@Override
	public void robotInit() {
		RobotMap.init();
		drivetrain = new Drivetrain();
		elevator = new Elevator();
		flipper = new Flipper();
		climber = new Climber();
		intake = new Intake();
		m_oi = new OI();
		autoChooser = new SendableChooser();
		autoChooser.addDefault("Default Program - Do Nothing", new DoNothing());
		autoChooser.addObject("Start Left Side", new CrossLineLeft());
		autoChooser.addObject("Start Middle", new RightCrossLineMiddle());
		autoChooser.addObject("Start Right Side", new CrossLineRight());
		
	}

	/**
	 * This function is called once each time the robot enters Disabled mode. You
	 * can use it to reset any subsystem information you want to clear when the
	 * robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable chooser
	 * code works with the Java SmartDashboard. If you prefer the LabVIEW Dashboard,
	 * remove all of the chooser code and uncomment the getString code to get the
	 * auto name from the text box below the Gyro
	 *
	 * <p>
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons to
	 * the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		autonomousCommand = (Command) autoChooser.getSelected();
		 
		if (gameData.length() > 0) {
			//scale is on the left
			if (gameData.charAt(1) == 'L') {
				//starting at left 
				if (autonomousCommand == new CrossLineLeft()) 
					(new LeftToLeft()).start(); 
				//starting at middle 
				if (autonomousCommand == new RightCrossLineMiddle())
					(new MiddleToLeft()).start(); 
				//starting at right 
				if (autonomousCommand == new CrossLineRight())
					(new RightToLeft()).start(); 
			//scale is on the right
			} else {
				//starting at left
				if (autonomousCommand == new CrossLineLeft())
					(new LeftToRight()).start(); 
				//starting at middle 
				if (autonomousCommand == new RightCrossLineMiddle())
					(new MiddleToRight()).start(); 
				//starting at right 
				if (autonomousCommand == new CrossLineRight())
					(new RightToRight()).start(); 
			}
		}
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}

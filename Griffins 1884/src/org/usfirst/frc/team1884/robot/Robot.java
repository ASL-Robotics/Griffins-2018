/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1884.robot;

import org.usfirst.frc.team1884.robot.commands.autocommands.CrossLine;
import org.usfirst.frc.team1884.robot.subsystems.Climber;
import org.usfirst.frc.team1884.robot.subsystems.CurrentManager;
import org.usfirst.frc.team1884.robot.subsystems.Drivetrain;
import org.usfirst.frc.team1884.robot.subsystems.ElevatorClaw;
import org.usfirst.frc.team1884.robot.subsystems.ElevatorShaft;
import org.usfirst.frc.team1884.robot.subsystems.IntakeMotor;
import org.usfirst.frc.team1884.robot.subsystems.IntakePiston;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {
	Command autonomousCommand;
	
	public static Drivetrain drivetrain;
	public static IntakeMotor intakeMotor;
	public static IntakePiston intakePiston;
	public static ElevatorShaft elevatorShaft;
	public static ElevatorClaw elevatorClaw;
	public static Climber climber;
	public static CurrentManager currentManager;

	public static OI m_oi;

	/**
	 * This function is run when the robot is first started up and should be used
	 * for any initialization code.
	 */
	@Override
	public void robotInit() {
		RobotMap.init();
		drivetrain = new Drivetrain();
		intakeMotor = new IntakeMotor();
		intakePiston = new IntakePiston();
		elevatorShaft = new ElevatorShaft();
		elevatorClaw = new ElevatorClaw();
		climber = new Climber();
		currentManager = new CurrentManager();
		
		m_oi = new OI();
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
		/*autonomousCommand = (Command) RobotMap.getAutoCommand();
		if(autonomousCommand != null) {
			autonomousCommand.start();
		}*/
		(new CrossLine()).start();
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

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1884.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//Flipper 
	//declare + initialize Flipper solenoids 
	public static DoubleSolenoid leftFlip = new DoubleSolenoid (0, 1); 
	public static DoubleSolenoid rightFlip = new DoubleSolenoid (2, 3); 
	
	//Intake
	//declare + initialize Intake motors 
	public static VictorSP motors_intakeLeft = new VictorSP (0); 
	public static VictorSP motors_intakeRight = new VictorSP (1); 
	
	//declare + initialize Intake solenoid
	public static DoubleSolenoid intakePistons = new DoubleSolenoid (4, 5); 
	
	//Climber 
	//declare + initialize Climber motor
	public static VictorSP motors_climb = new VictorSP (2); 
	
	//declare + initialize Climber piston
	public static DoubleSolenoid deployPiston = new DoubleSolenoid (6, 7); 
	
	//Drivetrain 
	//declare + initialize Drivetrain motors 
	public static Talon motor_frontL = new Talon (3); 
	public static Talon motor_frontR = new Talon (4); 
	public static Talon motor_backL = new Talon (5); 
	public static Talon motor_backR = new Talon (6); 
	
	
	//Elevator
	//Declare + initialize Elevator motor
	public static Talon motor_elevator = new Talon (7); 
	
	//declare + initialize Drivetrain SpeedControllerGroups 
	public static SpeedControllerGroup motors_left = new SpeedControllerGroup (motor_frontL, motor_backL);
	public static SpeedControllerGroup motors_right = new SpeedControllerGroup (motor_frontR, motor_backR);
	
	//declare + initialize Drivetrain DifferentialDrive 
	public static DifferentialDrive motors_driveTrain = new DifferentialDrive (motors_left, motors_right); 

	
	
}

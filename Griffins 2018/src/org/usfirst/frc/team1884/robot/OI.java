/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1884.robot;

import org.usfirst.frc.team1884.robot.commands.ClimbCommand;
import org.usfirst.frc.team1884.robot.commands.ClimberDeploy;
import org.usfirst.frc.team1884.robot.commands.FlipperCommandLeft;
import org.usfirst.frc.team1884.robot.commands.FlipperCommandRight;
import org.usfirst.frc.team1884.robot.commands.IntakeCommand;
import org.usfirst.frc.team1884.robot.commands.IntakePistonsCommand;
import org.usfirst.frc.team1884.robot.commands.OuttakeCommand;
import org.usfirst.frc.team1884.robot.util.XBox;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static XBox driver, operator;
	
	public OI() {
		
		driver = new XBox(0);
		
		operator = new XBox(1);
		
		//intake commands
		operator.getYButton().whenPressed(new IntakeCommand());
		operator.getAButton().whenPressed(new OuttakeCommand());
		operator.getRightStick().whenPressed(new IntakePistonsCommand());
		
		//climb commands 
		operator.getNorth().whileHeld(new ClimbCommand());
		operator.getLeftStick().whenPressed(new ClimberDeploy()); 
		
		//flipper commands 
		operator.getLeftBumper().whenPressed(new FlipperCommandLeft()); 
		operator.getRightBumper().whenPressed(new FlipperCommandRight()); 
		
		//elevator commands 
		//TODO
		
	}	
}

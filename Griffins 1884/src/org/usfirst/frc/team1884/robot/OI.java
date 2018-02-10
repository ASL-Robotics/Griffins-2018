/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1884.robot;

import org.usfirst.frc.team1884.robot.commands.ClimberClimbCommand;
import org.usfirst.frc.team1884.robot.commands.ClimberDeployCommand;
import org.usfirst.frc.team1884.robot.commands.FlipperLeftCommand;
import org.usfirst.frc.team1884.robot.commands.FlipperRightCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeInCommand;
import org.usfirst.frc.team1884.robot.commands.IntakePistonCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeOutCommand;
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
		operator.getYButton().whileHeld(new IntakeInCommand());
		operator.getAButton().whileHeld(new IntakeOutCommand());
		operator.getLeftStick().whenPressed(new IntakePistonCommand());
		
		//climb commands 
		operator.getNorth().whileHeld(new ClimberClimbCommand());
		operator.getLeftStick().whileHeld(new ClimberDeployCommand()); 
		
		//flipper commands 
		operator.getLeftBumper().whenPressed(new FlipperLeftCommand()); 
		operator.getRightBumper().whenPressed(new FlipperRightCommand()); 
		
		//elevator commands 
		//TODO
	}	
}

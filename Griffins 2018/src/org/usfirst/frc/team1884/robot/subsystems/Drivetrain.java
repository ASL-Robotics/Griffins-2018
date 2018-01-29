package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;
import org.usfirst.frc.team1884.robot.commands.DrivetrainCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

	public void initDefaultCommand() {
		setDefaultCommand(new DrivetrainCommand());  
	}
	
	public void drive (double x, double z) {
		
	}
}

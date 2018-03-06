package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;
import org.usfirst.frc.team1884.robot.commands.CurrentManagerCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CurrentManager extends Subsystem {

    
	public void manage(){
		if (RobotMap.PDP.getVoltage() > 9){
			RobotMap.COMPRESSOR.start();
		}else{
			RobotMap.COMPRESSOR.stop();
		}
		
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new CurrentManagerCommand());
    }
}


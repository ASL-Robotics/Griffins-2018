package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {

    public void initDefaultCommand() {

    }
    
    public void deploy () {
    		RobotMap.CLIMBER_PISTON.set(DoubleSolenoid.Value.kForward); 
    }
    
    public void climb () {
    		RobotMap.CLIMBER_MOTOR.set(1); 
    }
    
    public void stopClimb () {
    		RobotMap.CLIMBER_MOTOR.stopMotor(); 
    }
}


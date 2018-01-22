package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {

	//4 motors 2 pistons - 2 motors in 1 PWM port 
    public void initDefaultCommand() {

    }
    
    public void intake () {
    		RobotMap.motors_intakeLeft.set(1);
    		RobotMap.motors_intakeRight.set(-1);
    }
    
    public void toggleIntake () {
		if (RobotMap.intakePistons.get() == DoubleSolenoid.Value.kReverse) {
    		RobotMap.intakePistons.set(DoubleSolenoid.Value.kForward); 
		}
		else if (RobotMap.intakePistons.get() == DoubleSolenoid.Value.kForward) {
			RobotMap.intakePistons.set(DoubleSolenoid.Value.kReverse); 
		}
    }
    
    public void outtake () {
		RobotMap.motors_intakeLeft.set(-1);
		RobotMap.motors_intakeRight.set(1);
    }
    
    public void off () {
		RobotMap.motors_intakeLeft.stopMotor();
		RobotMap.motors_intakeRight.stopMotor();
    }
    
}


package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;
import org.usfirst.frc.team1884.robot.commands.ElevatorTestCommand;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ElevatorShaft extends Subsystem {

	public static class Height {
		public static final int LOW = 90000, MIDDLE = 100000, HIGH = 125000;
	}

	public ElevatorShaft() {
		// TODO change the kPID values to real ones
		RobotMap.ELEVATOR_MOTOR.config_kP(0, 0.08, 10);
		RobotMap.ELEVATOR_MOTOR.config_kI(0, 0, 10);
		RobotMap.ELEVATOR_MOTOR.config_kD(0, 0, 10);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new ElevatorTestCommand());

	}
	
	public void joystickControl(double output){
		RobotMap.ELEVATOR_MOTOR.set(ControlMode.PercentOutput, output);
	}
	
	public void setHeight(int height) {
		RobotMap.ELEVATOR_MOTOR.setIntegralAccumulator(0, 0, 10);
		RobotMap.ELEVATOR_MOTOR.set(ControlMode.Position, height);

	}

	public void stopElevator() {
		RobotMap.ELEVATOR_MOTOR.set(ControlMode.PercentOutput, 0);
	}

	public boolean isBottom() {
		return !RobotMap.ELEVATOR_SWITCH.get();
	}

	public boolean isHeight(int height) {
		return (RobotMap.ELEVATOR_MOTOR.getSelectedSensorPosition(0) < height + 1000)
				&& (RobotMap.ELEVATOR_MOTOR.getSelectedSensorPosition(0) > height - 1000);

	}

	public void resetEncoder() {
		RobotMap.ELEVATOR_MOTOR.setSelectedSensorPosition(0,0,10);
	}


}

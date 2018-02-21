/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1884.robot;

import org.usfirst.frc.team1884.robot.commands.ClimberClimbCommand;
import org.usfirst.frc.team1884.robot.commands.ClimberDeployCommand;
import org.usfirst.frc.team1884.robot.commands.ClimberReverseDeployCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorBottomCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorCloseClawCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorLowCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorMiddleCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorOpenClawCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorTopCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeDownCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeHorizontalPistonCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeInCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeOutCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeSpinCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeUpCommand;
import org.usfirst.frc.team1884.robot.util.XBox;

import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static XBox driver, operator;

	public OI() {

		driver = new XBox(0);

		operator = new XBox(1);

		// intake commands
		(new RightXLeft(operator)).whileActive(new IntakeInCommand());
		(new RightXRight(operator)).whileActive(new IntakeOutCommand());
		(new RightYUp(operator)).whenActive(new IntakeUpCommand());
		(new RightYDown(operator)).whenActive(new IntakeDownCommand());
		operator.getLeftStick().whenPressed(new IntakeHorizontalPistonCommand());
		operator.getRightStick().whileHeld(new IntakeSpinCommand());

		// elevator commands
		operator.getRightBumper().whenPressed(new ElevatorCloseClawCommand());
		operator.getLeftBumper().whenPressed(new ElevatorOpenClawCommand());
		operator.getXButton().whenPressed(new ElevatorBottomCommand());
		operator.getAButton().whenPressed(new ElevatorLowCommand());
		operator.getBButton().whenPressed(new ElevatorMiddleCommand());
		operator.getYButton().whenPressed(new ElevatorTopCommand());
		
		// climb commands
		operator.getNorth().whileHeld(new ClimberDeployCommand());
		operator.getSouth().whileHeld(new ClimberReverseDeployCommand());
		operator.getBack().whileHeld(new ClimberClimbCommand());

	}

	public static class RightXLeft extends Trigger {

		XBox j;

		public RightXLeft(XBox j) {
			this.j = j;
		}

		@Override
		public boolean get() {
			return j.getRightX() < -0.5;
		}

	}

	public static class RightXRight extends Trigger {
		
		XBox j;

		public RightXRight(XBox j) {
			this.j = j;
		}

		@Override
		public boolean get() {
			return j.getRightX() > 0.5;
		}

	}

	public static class RightYUp extends Trigger {
		
		XBox j;

		public RightYUp(XBox j) {
			this.j = j;
		}

		@Override
		public boolean get() {
			return j.getRightY() > 0.5;
		}

	}

	public static class RightYDown extends Trigger {

		XBox j;

		public RightYDown(XBox j) {
			this.j = j;
		}
		
		@Override
		public boolean get() {
			return j.getRightY() < -0.5;
		}

	}

}

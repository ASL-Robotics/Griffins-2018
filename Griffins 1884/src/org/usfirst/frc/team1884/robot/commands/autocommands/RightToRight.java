package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.ElevatorClawCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorLowCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorTopCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeInCommand;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfile3B;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileBD;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileDF;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileFD;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileRot180;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightToRight extends CommandGroup {

    public RightToRight() {
    	addSequential(new MotionProfile3B());
    	addSequential(new MotionProfileBD());
    	//Add command to put on switch here
    	addSequential(new ElevatorTopCommand());
    	addSequential(new ElevatorClawCommand());
    	addSequential(new ElevatorLowCommand());
    	addSequential(new MotionProfileRot180());
    	addSequential(new MotionProfileDF());
    	//Add command to pick up box
    	addSequential(new IntakeInCommand());
    	addSequential(new ElevatorClawCommand());
    	addSequential(new MotionProfileRot180());
    	addSequential(new MotionProfileFD());
    	//Add command to put on switch here
    	addSequential(new ElevatorTopCommand());
    	addSequential(new ElevatorClawCommand());
    	
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}

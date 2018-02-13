package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.ElevatorClawCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorLowCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorTopCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeInCommand;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfile2C;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileAC;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileCE;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileEC;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileRot180;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileScaleForward;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MiddleToLeft extends CommandGroup {

    public MiddleToLeft() {
    	//go to scale
    	addSequential(new MotionProfile2C());
    	addSequential(new MotionProfileAC());

    //put cube on scale 
    	addSequential(new ElevatorTopCommand());
    	addSequential(new MotionProfileScaleForward());
    	//opens claw - releasing cube
    	addSequential(new ElevatorClawCommand()); 
    	addSequential(new ElevatorLowCommand()); 

    	//go to cubes 
    	addSequential(new MotionProfileRot180());
    	addSequential(new MotionProfileScaleForward());
    	addSequential(new MotionProfileCE());
    	
    	//pick up cube
    	addSequential(new IntakeInCommand());
    	//closes claw
    	addSequential(new ElevatorClawCommand()); 
    	
    	//go to scale 
    	addSequential(new MotionProfileRot180());
    	addSequential(new MotionProfileEC());
    	
    	//put cube on scale
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

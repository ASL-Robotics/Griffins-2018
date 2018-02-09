package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfile2A;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileAC;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileCE;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileEC;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileRot180;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MiddleToLeft extends CommandGroup {

    public MiddleToLeft() {
    	addSequential(new MotionProfile2A());
    	addSequential(new MotionProfileAC());
    	//Add command to put on switch here
    	addSequential(new MotionProfileRot180());
    	addSequential(new MotionProfileCE());
    	//Add command to pick up box
    	addSequential(new MotionProfileRot180());
    	addSequential(new MotionProfileEC());
    	//Add command to put on switch here
    	
    	
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

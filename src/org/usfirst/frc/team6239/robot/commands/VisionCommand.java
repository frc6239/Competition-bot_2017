package org.usfirst.frc.team6239.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6239.robot.Robot;

/**
 * Created by HighSchoolDude1 on 2/17/2017.
 */
public class VisionCommand extends Command {
    public VisionCommand() {
        requires(Robot.vision);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    public void execute() {
        Robot.vision.VisionCommand();

    }

}

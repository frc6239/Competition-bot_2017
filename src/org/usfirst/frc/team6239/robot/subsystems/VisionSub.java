package org.usfirst.frc.team6239.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;
import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class VisionSub extends Subsystem {
	public enum DriveConfig {
		left,
		right,
		none
	}


	DriveConfig drive_config;
	double side = NetworkTable.getTable("Robot").getDouble("Side");
	Timer time = new Timer();
	AHRS ahrs = new AHRS(Port.kMXP);


	protected void initDefaultCommand() {


	}
	public void VisionCommand() {
		if (side == 1.0) {
			drive_config = DriveConfig.left;
		} else if (side == 2) {
			drive_config = DriveConfig.right;
		} else if (side == 3) {
			drive_config = DriveConfig.none;
		}
		if (Robot.robotmap.isSeen) {

			if (drive_config.equals(DriveConfig.left)) {

				while (20 > Robot.robotmap.curAngle && Robot.robotmap.isSeen) {
					Robot.DRIVE_SUB.TurnLeft(1, 1);

					if (Robot.robotmap.curAngle > 20 && Robot.robotmap.curAngle < 20.5) {
						Robot.DRIVE_SUB.tank(1, 1);
						try {
							time.wait(1);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
					}


				}


			} else if (drive_config.equals(DriveConfig.right)) {

				while (-20 > Robot.robotmap.curAngle && Robot.robotmap.isSeen) {
					Robot.DRIVE_SUB.TurnRight(1, 1);

					if (Robot.robotmap.curAngle > 20 && Robot.robotmap.curAngle < 20.5) {
						Robot.DRIVE_SUB.tank(1, 1);
						try {
							time.wait(1);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
					}


				}


			} else {
				Robot.DRIVE_SUB.tank(0, 0);
			}
		}
	}
}
	


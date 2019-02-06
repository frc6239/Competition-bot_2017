package org.usfirst.frc.team6239.robot;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team6239.robot.commands.ClimbCommand;
import org.usfirst.frc.team6239.robot.commands.DumpDownCommand;
import org.usfirst.frc.team6239.robot.commands.DumpUpCommand;
import org.usfirst.frc.team6239.robot.commands.MoveLeftAuto;
import org.usfirst.frc.team6239.robot.commands.MoveRightAuto;

import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team6239.robot.commands.RollerGrabberCommand;
import org.usfirst.frc.team6239.robot.subsystems.RollerGrabberSub;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	
	public Button ClimberControl;
	public Joystick gamepad;
	public Button LeftJoystick;
	public Button RightJoystick;
	public Joystick stickcontrolerL;
	public Joystick stickcontrolerR;
	public Button RollerGrab;
	public Button CancelRoller;
	public Button DumpUp;
	public Button DumpDown;
	public Button MoveLeft;
	public Button MoveRight;
	public  DigitalInput limitswitch1;
	public  DigitalInput limitswitch2;
	public  DigitalInput limitswitch3;
	public  DigitalInput limitswitch4;
    public  AHRS ahrs;
	public Encoder encoderL;
	public Encoder encoderR;	public DigitalInput limitswitch1;
	public DigitalInput limitswitch2;
	public DigitalInput limitswitch3;
	public DigitalInput limitswitch4;
    public AHRS ahrs;
	public OI() {
		encoderL = new Encoder(4,5);
		encoderR = new Encoder(6,7 );
//		encoderL.reset();
//		encoderR.reset();
	
		gamepad = new Joystick(0);

		LeftJoystick = new JoystickButton(gamepad, 0);
		RightJoystick = new JoystickButton(gamepad, 1);


		stickcontrolerL = new Joystick(1);
		stickcontrolerR = new Joystick(2);


		RollerGrab = new JoystickButton(stickcontrolerR, 1);
        RollerGrab.whileHeld(new RollerGrabberCommand());


    	DumpUp = new JoystickButton(stickcontrolerL,2);
		DumpDown = new JoystickButton(stickcontrolerR,2);
		DumpUp.whenPressed(new DumpUpCommand());
		DumpDown.whenPressed(new DumpDownCommand());


		ahrs = new AHRS(I2C.Port.kMXP);


		limitswitch1 = new DigitalInput(3);
		limitswitch2 = new DigitalInput(2);
		limitswitch3 = new DigitalInput(0);
		limitswitch4 = new DigitalInput(1);
		
}
	
    public boolean isMoving() {
        return !(Robot.oi.stickcontrolerL.getY() > 0.05 && Robot.oi.stickcontrolerR.getY() > 0.05);
    }
    public void updateSensors(){
        Robot.robotmap.limitswitch1 = limitswitch1.get();
        Robot.robotmap.limitswitch2 = limitswitch2.get();
        Robot.robotmap.limitswitch3 = limitswitch3.get();
        Robot.robotmap.limitswitch4 = limitswitch4.get();

    }

    public int EncoderLeft() {
        
        return encoderL.get();
        
       
       }
       public int EncoderRight(){
       
       return encoderR.get();
       
       }
      public int EncoderValue(){
       
    	int EncoderVal = (EncoderLeft() + EncoderRight()) / 2;
    	SmartDashboard.putNumber("Encoder", EncoderRight());
    	  System.out.println(EncoderLeft()+" "+EncoderRight());
    encoderL.getStopped();
    encoderR.getStopped();
    System.out.println(encoderL.getStopped());
    System.out.println(encoderR.getStopped());
    
    	  return EncoderVal;
       
      }
}

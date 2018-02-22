// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc0.MyRobot2018;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static AnalogGyro driveAnalogGyro1;
    public static SpeedController driveSpeedController1;
    public static SpeedController driveSpeedController2;
    public static DifferentialDrive driveDifferentialDrive1;
    public static WPI_TalonSRX powerCubeLiftTalonSRX1;
    public static SpeedController powerCubeIntakeSpeedController1;
    public static SpeedController powerCubeIntakeSpeedController2;
    public static DigitalInput powerCubeIntakeLimitSwitch1;
    public static DigitalInput powerCubeIntakeLimitSwitch2;
    public static SpeedController climbingLiftSpeedController1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveAnalogGyro1 = new AnalogGyro(0);
        LiveWindow.addSensor("Drive", "AnalogGyro 1", driveAnalogGyro1);
        driveAnalogGyro1.setSensitivity(0.007);
        driveSpeedController1 = new Spark(0);
        LiveWindow.addActuator("Drive", "Speed Controller 1", (Spark) driveSpeedController1);
        driveSpeedController1.setInverted(false);
        driveSpeedController2 = new Spark(1);
        LiveWindow.addActuator("Drive", "Speed Controller 2", (Spark) driveSpeedController2);
        driveSpeedController2.setInverted(false);
        driveDifferentialDrive1 = new DifferentialDrive(driveSpeedController1, driveSpeedController2);
        LiveWindow.addActuator("Drive", "Differential Drive 1", driveDifferentialDrive1);
        driveDifferentialDrive1.setSafetyEnabled(true);
        driveDifferentialDrive1.setExpiration(0.1);
        driveDifferentialDrive1.setMaxOutput(1.0);

        powerCubeLiftTalonSRX1 = new WPI_TalonSRX(0);
        powerCubeLiftTalonSRX1.configSelectedFeedbackSensor(com.ctre.phoenix.motorcontrol.FeedbackDevice.QuadEncoder, 0, 0);
        
        powerCubeIntakeSpeedController1 = new Spark(2);
        LiveWindow.addActuator("PowerCubeIntake", "Speed Controller 1", (Spark) powerCubeIntakeSpeedController1);
        powerCubeIntakeSpeedController1.setInverted(false);
        powerCubeIntakeSpeedController2 = new Spark(3);
        LiveWindow.addActuator("PowerCubeIntake", "Speed Controller 2", (Spark) powerCubeIntakeSpeedController2);
        powerCubeIntakeSpeedController2.setInverted(false);
        powerCubeIntakeLimitSwitch1 = new DigitalInput(0);
        LiveWindow.addSensor("PowerCubeIntake", "Limit Switch 1", powerCubeIntakeLimitSwitch1);
        
        powerCubeIntakeLimitSwitch2 = new DigitalInput(1);
        LiveWindow.addSensor("PowerCubeIntake", "Limit Switch 2", powerCubeIntakeLimitSwitch2);
        
        climbingLiftSpeedController1 = new Spark(4);
        LiveWindow.addActuator("ClimbingLift", "Speed Controller 1", (Spark) climbingLiftSpeedController1);
        climbingLiftSpeedController1.setInverted(false);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}

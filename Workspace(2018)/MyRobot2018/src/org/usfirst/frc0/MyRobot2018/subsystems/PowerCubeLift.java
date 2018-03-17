// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc0.MyRobot2018.subsystems;

import org.usfirst.frc0.MyRobot2018.RobotMap;
import org.usfirst.frc0.MyRobot2018.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class PowerCubeLift extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX talonSRX1 = RobotMap.powerCubeLiftTalonSRX1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void lift_up()
    {
    	talonSRX1.set(.8);
    }
    
    public void lift_down()
    {
    	talonSRX1.set(-0.8);
    }
    
    public void lift_stop()
    {
    	talonSRX1.set(0.0);
    }
    
    public void lift_scale()
    {
    	System.out.print(talonSRX1.getSelectedSensorPosition(0));
    	System.out.print(talonSRX1.getSelectedSensorPosition(1));
    	talonSRX1.setSelectedSensorPosition(5000, 1, 5000);
    }
    
    public void lift_switch()
    {
    	talonSRX1.setSelectedSensorPosition(1, 1, 5000);
    }
    
    public void lift_bottom()
    {
    	talonSRX1.setSelectedSensorPosition(0, 1, 5000);
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}


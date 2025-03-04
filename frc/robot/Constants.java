// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/** Add your docs here. */
public final class Constants {
    public static final class rollerConstants {
        public static final int ROLLER_MOTOR_ID = 15;
        public static final int ROLLER_MOTOR_CURRENT_LIMIT = 60;
        public static final double ROLLER_MOTOR_VOLTAGE_COMP = 10;
        public static final double ROLLER_CORAL_OUT = -.4;
        public static final double ROLLER_ALGAE_IN = -0.8;
        public static final double ROLLER_ALGAE_OUT = 0.4;
        public static final double ROLLER_CORAL_STACK = -1;
      }
    
      public static final class armConstants {
        public static final int ARM_MOTOR_ID = 14;
        public static final int ARM_MOTOR_CURRENT_LIMIT = 60;
        public static final double ARM_MOTOR_VOLTAGE_COMP = 10;
        public static final double ARM_SPEED_DOWN = 0.4;
        public static final double ARM_SPEED_UP = -0.4;
        public static final double ARM_HOLD_DOWN = 0.1;
        public static final double ARM_HOLD_UP = -0.15;
      }
    
      public static final class climberConstants {
        public static final int CLIMBER_MOTOR_ID = 13;
        public static final int CLIMBER_MOTOR_CURRENT_LIMIT = 60;
        public static final double CLIMBER_MOTOR_VOLTAGE_COMP = 12;
        public static final double CLIMBER_SPEED_DOWN = -0.5;
        public static final double CLIMBER_SPEED_UP = 0.5;
      }
    
      public static final class operatorConstants {
        public static final int DRIVER_CONTROLLER_PORT = 0;
        public static final int OPERATOR_CONTROLLER_PORT = 1;
      }
    }

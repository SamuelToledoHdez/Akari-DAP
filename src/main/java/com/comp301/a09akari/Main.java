/**
 * @mainpage Akari DAP Project Documentation
 *
 * @section intro Introduction
 * This documentation provides an overview of the Akari DAP project, inspired by the Akari logic puzzle. The objective of the game is to illuminate all cells on the grid without lighting those containing light bulbs. The project is backed by Maven, a project management tool that simplifies building and dependency management.
 *
 * @section ci Continuous Integration
 * Continuous integration has been achieved through Jenkins and CircleCI, ensuring an efficient and reliable development flow. SonarCloud has been implemented for static code analysis, enhancing code quality and detecting potential issues. Unit tests have been developed with JUnit to ensure the robustness and reliability of the code.
 *
 * @section tech Technologies and Practices
 * Developed in Java, this project leverages modern technologies and practices to deliver a solid and maintainable implementation of the Akari game. Maven streamlines project management, while Jenkins, CircleCI, and SonarCloud contribute to a comprehensive and high-quality development process.
 */

/**
 * @file Main.java
 * The entry point for the Akari puzzle game application.
 */
package com.comp301.a09akari;

import com.comp301.a09akari.view.AppLauncher;
import javafx.application.Application;


public class Main {
  /**
   * The main method that launches the JavaFX application using AppLauncher.
   *
   * @param args Command-line arguments (not used in this application).
   */
  public static void main(String[] args) {
    Application.launch(AppLauncher.class); // Launch the JavaFX application using AppLauncher
  }
}

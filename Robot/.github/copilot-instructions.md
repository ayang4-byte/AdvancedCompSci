# Copilot / AI Agent Instructions for CleanBot Robot

Purpose: provide concise, actionable guidance so an AI coding assistant can be immediately productive in this small Java exercise project.

Quick context
- This workspace contains two primary source files at the project root: `Robot.java` and `RobotTester.java`.
- `Robot.java` contains the Robot class skeleton (constructor, movement logic, display helpers) with TODOs. `RobotTester.java` is the (empty) test/runner placeholder.
- No build system (Maven/Gradle) is present — compile and run with `javac` and `java`.

Essential tasks the agent may be asked to perform
- Implement `Robot` constructor and core methods: `move()`, `clearHall()`, `hallIsClear()` and complete `displayState()`.
- Add or update `RobotTester` to exercise behaviors and demonstrate expected output.

Project-specific patterns & constraints
- Single-package, default (no `package` statement) Java classes — keep generated classes in the default package.
- Public class names must match filenames (`Robot` in `Robot.java`, `RobotTester` in `RobotTester.java`).
- Keep I/O to `System.out` for display methods; `displayState()` is used to show hallway contents and robot position.

Examples & concrete prompts for the code
- Implement constructor: initialize `hallway`, `position`, and `isFacingRight` from inputs. Example signature: `public Robot(int[] hallwayToClean, int startingPosition)`.
- Movement behavior: the robot should pick up items (set hallway cell to 0), step forward when possible, and turn around when blocked by a wall. Use `isRobotBlockedByWall()` helper for boundary checks.
- `clearHall()` should repeatedly call `displayState()` and `move()` until `hallIsClear()` returns true; return total move count.

Build / run / test commands (zsh/macOS)
- Compile: `javac Robot.java RobotTester.java`
- Run the tester (after implementing `RobotTester` with `main`): `java RobotTester`

Observability & examples in repo
- `displayState()` prints hallway values on one line and a second line with `>` or `<` marking the robot position and facing direction. Use this output format when writing tests or examples so existing test output assertions remain stable.

What to avoid
- Do not add package declarations unless asked — tests and grading may expect default package.
- Avoid changing file/class names. Keep methods public with the same signatures so external tests can call them.

When you finish a change
- Add a minimal `RobotTester` `main` that demonstrates the implemented behavior (example: construct a `Robot` with a sample `int[]` hallway, call `clearHall()`, and print the returned move count).
- Show sample console output in PR description or commit message.

If a gap is discovered
- If additional files or a different build system exist, stop and list the files found and request clarification before making wide changes.

Contact for clarification
- Ask the user which behavior model they expect for `move()` (e.g., whether picking up an item is automatic when stepping onto it, or if picking up is a distinct action). Include a small example input and expected output to confirm.

End of file.

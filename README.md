Try Out Basic Code and Concept Development of  Java
Open in Dev Containers

A development container is a running container with a well-defined tool/runtime stack and its prerequisites. You can try out development containers with GitHub Codespaces or Visual Studio Code Dev Containers.

This is a sample project that lets you try out either option in a few easy steps. We have a variety of other vscode-remote-try-* sample projects, too.

Note: If you already have a Codespace or dev container, you can jump to the Things to try section.

Setting up the development container
GitHub Codespaces
Follow these steps to open this sample in a Codespace:

Click the Code drop-down menu.
Click on the Codespaces tab.
Click Create codespace on main.
For more info, check out the GitHub documentation.

VS Code Dev Containers
If you already have VS Code and Docker installed, you can click the badge above or here to get started. Clicking these links will cause VS Code to automatically install the Dev Containers extension if needed, clone the source code into a container volume, and spin up a dev container for use.

Follow these steps to open this sample in a container using the VS Code Dev Containers extension:

If this is your first time using a development container, please ensure your system meets the pre-reqs (i.e. have Docker installed) in the getting started steps.

To use this repository, you can either open the repository in an isolated Docker volume:

Press F1 and select the Dev Containers: Try a Sample... command.
Choose the "Java" sample, wait for the container to start, and try things out!
Note: Under the hood, this will use the Dev Containers: Clone Repository in Container Volume... command to clone the source code in a Docker volume instead of the local filesystem. Volumes are the preferred mechanism for persisting container data.

Or open a locally cloned copy of the code:

Clone this repository to your local filesystem.
Press F1 and select the Dev Containers: Open Folder in Container... command.
Select the cloned copy of this folder, wait for the container to start, and try things out!
Things to try
Once you have this sample opened, you'll be able to work with it like you would locally.

Some things to try:

Edit:

Open src/main/java/com/mycompany/app/App.java.
Try adding some code and check out the language features.
Make a spelling mistake and notice it is detected. The Code Spell Checker extension was automatically installed because it is referenced in .devcontainer/devcontainer.json.
Also notice that the Extension Pack for Java is installed. The JDK is in the mcr.microsoft.com/devcontainers/java image and Dev Container settings and metadata are automatically picked up from image labels.
Terminal: Press Ctrl+Shift+` and type uname and other Linux commands from the terminal window.

Build, Run, and Debug:

Open src/main/java/com/mycompany/app/App.java.
Add a breakpoint.
Press F5 to launch the app in the container.
Once the breakpoint is hit, try hovering over variables, examining locals, and more.
Run a Test:

Open src/test/java/com/mycompany/app/AppTest.java.
Put a breakpoint in a test.
Click the Debug Test in the Code Lens above the function and watch it hit the breakpoint.
Install Node.js using a Dev Container Feature:

Press F1 and select the Dev Containers: Configure Container Features... or Codespaces: Configure Container Features... command.
Type "node" in the text box at the top.
Check the check box next to "Node.js (via nvm) and yarn" (published by devcontainers)
Click OK
Press F1 and select the Dev Containers: Rebuild Container or Codespaces: Rebuild Container command so the modifications are picked up.
Contributing
This project welcomes contributions and suggestions. Most contributions require you to agree to a Contributor License Agreement (CLA) declaring that you have the right to, and actually do, grant us the rights to use your contribution. For details, visit https://cla.microsoft.com.

When you submit a pull request, a CLA-bot will automatically determine whether you need to provide a CLA and decorate the PR appropriately (e.g., label, comment). Simply follow the instructions provided by the bot. You will only need to do this once across all repos using our CLA.

This project has adopted the Microsoft Open Source Code of Conduct. For more information see the Code of Conduct FAQ or contact opencode@microsoft.com with any additional questions or comments.

License
Copyright © Microsoft Corporation All rights reserved.
Licensed under the MIT License. See LICENSE in the project root for license information.

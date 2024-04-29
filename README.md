https://stackoverflow.com/questions/16433915/how-to-copy-file-from-one-location-to-another-location

Initial Proposal:

This piece of software will allow a user to monitor the status of a machine and be able to back up a file or directory of the users choosing. The user will be able to go onto a website in which they will be able to see details such as CPU and memory utilisation and they will also be able to enter the address of the machine that contains the files, the Linux file or directory they would like to backup and where they would like it to back it up to. Once they have submitted these details, the program will find the file or multiple files the user wishes to backup and copy them to the target location.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Requirement Spec:

Function Copies a selected file

Description The user will have a box that they can use to either enter the absolute path to a file/directory or they can locate the file/directory in a file browser. Once the file/directory has been selected, the user will then choose where they want the file to be copied to in a storage device on an MCSE server. Once this has been selected, the user will confirm the paths, at which point the selected file/directory will be backed up to the selected location.

Inputs File/directory

Source The user’s computer or a network location such as a SMB network share

Outputs File/directory

Destination The selected destination directory

Information needed The paths to the source and target destinations

Action Once the source and target destinations have been set, the program will copy the file/directory to the selected destination

Pre-condition The selected source and target paths must exist

Post-condition The selected destination will have a new file/directory copied to it

Side effects None

\

Function CPU monitor

Description There will be a graph that the user can use to see what the current utilisation of the CPU is

Inputs Current CPU use

Source An API such as Sigar

Outputs A graph representation

Destination The input to a graph library such as D3

Information needed Current CPU utilisation

Action The Sigar API will be used to get a figure for the current CPU utilisation for the server that is running the application. This will then be fed into a graph library such as D3 which will then display the utilisation in graph form

Pre-condition A figure for the CPU utilisation is needed

Post-condition None

Side effects None

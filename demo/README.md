# Git and GitHub Comprehensive Guide

This repository contains a detailed guide on handling essential Git and GitHub concepts. Each section provides step-by-step instructions and corresponding Git commands for mastering these concepts.

## Table of Contents
1. [Creating a Repository](#1-creating-a-repository)
2. [Cloning a Repository](#2-cloning-a-repository)
3. [Creating Branches](#3-creating-branches)
4. [Committing Changes](#4-committing-changes)
5. [Reverting Commits](#5-reverting-commits)
6. [Pulling and Pushing Changes](#6-pulling-and-pushing-changes-downstream-and-upstream)
7. [Fetching Changes](#7-fetching-changes)
8. [Merging Branches](#8-merging-branches)
9. [Renaming Branches](#9-renaming-branches)
10. [Creating Pull Requests](#10-creating-pull-requests)
11. [Reviewing and Merging Pull Requests](#11-reviewing-and-merging-pull-requests)
12. [Reverting Pull Requests](#12-reverting-pull-requests)

---

## 1. Creating a Repository

To create a new Git repository:

### Locally:
```bash
git init
```
This command initializes a new Git repository in your current directory.

On GitHub:
Navigate to GitHub and click New Repository.
Enter a repository name, description (optional), and choose the visibility (public/private).
Optionally add a README, .gitignore, or a license.
Click Create Repository.
## 2. Cloning a Repository
To clone a repository from GitHub to your local machine:

```bash
git clone <repository-url>
```
Example:

```bash
git clone https://github.com/username/repo-name.git
```
## 3. Creating Branches
To create a new branch:

```bash
git branch <branch-name>
```
To switch to that branch:

```bash
git checkout <branch-name>
```
Alternatively, you can create and switch to a branch in one command:

``` bash
git checkout -b <branch-name>
```

## 4. Committing Changes
To stage files for commit:

```bash
git add <file-name>
```
Or stage all changes:

```bash
git add .
```
#### To commit staged changes with a descriptive message:

``` bash
git commit -m "Your commit message"
```
## 5. Reverting Commits
To undo a specific commit and create a new commit that reverses the changes:

```bash
git revert <commit-hash>
```
## 6. Pulling and Pushing Changes (Downstream and Upstream)
Pulling Changes (Downstream)
To fetch and merge changes from the remote repository:

``` bash
git pull
```

#### Pushing Changes (Upstream)
To send your local commits to the remote repository:

``` bash
git push origin <branch-name>
```
## 7. Fetching Changes
To fetch updates from the remote repository without merging them:

```bash
git fetch
```
This command downloads the changes, and you can manually merge them later.

## 8. Merging Branches
To merge changes from one branch into another:

Switch to the branch you want to merge into:
``` bash
git checkout <target-branch>
```
Merge the other branch:
```bash
git merge <source-branch>
```
## 9. Renaming Branches
To rename a branch locally:

```bash
git branch -m <new-branch-name>
```
To push the renamed branch and delete the old branch from the remote repository:

```bash
git push origin -u <new-branch-name>
git push origin --delete <old-branch-name>
```
## 10. Creating Pull Requests
Push your branch to the remote repository:
```bash
git push origin <branch-name>
```
On GitHub, navigate to your repository and click on Pull Requests.
Select the branches to compare and create a pull request.
## 11. Reviewing and Merging Pull Requests
#### To review and merge a pull request:

Navigate to the pull request on GitHub.
Review the code changes.
If everything is correct, click Merge Pull Request.
## 12. Reverting Pull Requests
If a merged pull request needs to be reverted:

Identify the commit hash from the merged pull request.
Revert it using:
``` bash
git revert <commit-hash>
```
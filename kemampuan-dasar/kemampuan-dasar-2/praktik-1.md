zeon@Latitude:~/Documents/Boothcamp/rhymes$ wget https://www.acquia.com/sites/default/files/blog/hokey-pokey.txt 
--2020-08-15 11:15:07--  https://www.acquia.com/sites/default/files/blog/hokey-pokey.txt
Resolving www.acquia.com (www.acquia.com)... 104.16.117.45, 104.16.118.45, 2606:4700::6810:762d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.117.45|:443... connected.
HTTP request sent, awaiting response... 404 Not Found
2020-08-15 11:15:08 ERROR 404: Not Found.

zeon@Latitude:~/Documents/Boothcamp/rhymes$ git status
On branch master
nothing to commit, working tree clean
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git log
commit 1ac11c82c1977c782a56dedf7b868ed11eabaf1a (HEAD -> master)
Author: hamkasatria <muhhamkasatrianto@gmail.com>
Date:   Sat Aug 15 11:13:43 2020 +0700

    Added project overview to README.txt

commit 824a1afb77bfc19fa9b662685f607630e0b30775
Author: hamkasatria <muhhamkasatrianto@gmail.com>
Date:   Sat Aug 15 11:11:20 2020 +0700

    First commit
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git log -oneline
fatal: unrecognized argument: -oneline
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git log --oneline
1ac11c8 (HEAD -> master) Added project overview to README.txt
824a1af First commit
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git log -p
commit 1ac11c82c1977c782a56dedf7b868ed11eabaf1a (HEAD -> master)
Author: hamkasatria <muhhamkasatrianto@gmail.com>
Date:   Sat Aug 15 11:13:43 2020 +0700

    Added project overview to README.txt

diff --git a/README.txt b/README.txt
index e69de29..55ce3e9 100644
--- a/README.txt
+++ b/README.txt
@@ -0,0 +1 @@
+This repo is a collection of my favorite nursety rhymes.

commit 824a1afb77bfc19fa9b662685f607630e0b30775
Author: hamkasatria <muhhamkasatrianto@gmail.com>
Date:   Sat Aug 15 11:11:20 2020 +0700

    First commit

diff --git a/README.txt b/README.txt
new file mode 100644
index 0000000..e69de29
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git remote add origin https://github.com/hamkasatria/rhymes.git
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git push -u origin master
Username for 'https://github.com': hamkasatria
Password for 'https://hamkasatria@github.com': 
remote: Repository not found.
fatal: repository 'https://github.com/hamkasatria/rhymes.git/' not found
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git push -u origin master
Username for 'https://github.com': hamkasatria
Password for 'https://hamkasatria@github.com': 
Enumerating objects: 6, done.
Counting objects: 100% (6/6), done.
Delta compression using up to 4 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (6/6), 506 bytes | 506.00 KiB/s, done.
Total 6 (delta 0), reused 0 (delta 0)
To https://github.com/hamkasatria/rhymes.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git clone https://github.com/bryanhirsch/rhymes.git
Cloning into 'rhymes'...
remote: Enumerating objects: 23, done.
remote: Total 23 (delta 0), reused 0 (delta 0), pack-reused 23
Unpacking objects: 100% (23/23), 2.81 KiB | 575.00 KiB/s, done.
zeon@Latitude:~/Documents/Boothcamp/rhymes$ cd rhymes
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git checkout -b hickory-dickory
Switched to a new branch 'hickory-dickory'
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ wget https://https://www.acquia.com/blog/why-effective-marketing-requires-foundation-unified-customer-intelligence.txt
--2020-08-15 11:28:42--  https://https//www.acquia.com/blog/why-effective-marketing-requires-foundation-unified-customer-intelligence.txt
Resolving https (https)... failed: Temporary failure in name resolution.
wget: unable to resolve host address ‘https’
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ wget https://www.acquia.com/blog/why-effective-marketing-requires-foundation-unified-customer-intelligence.txt
--2020-08-15 11:29:01--  https://www.acquia.com/blog/why-effective-marketing-requires-foundation-unified-customer-intelligence.txt
Resolving www.acquia.com (www.acquia.com)... 104.16.118.45, 104.16.117.45, 2606:4700::6810:752d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.118.45|:443... connected.
HTTP request sent, awaiting response... 404 Not Found
2020-08-15 11:29:02 ERROR 404: Not Found.

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ wget https://www.acquia.com/blog/cmo-secrets-erin-cresta
--2020-08-15 11:30:18--  https://www.acquia.com/blog/cmo-secrets-erin-cresta
Resolving www.acquia.com (www.acquia.com)... 104.16.118.45, 104.16.117.45, 2606:4700::6810:762d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.118.45|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: unspecified [text/html]
Saving to: ‘cmo-secrets-erin-cresta’

cmo-secrets-erin-cr     [    <=>             ]  93,28K  51,9KB/s    in 1,8s    

2020-08-15 11:30:20 (51,9 KB/s) - ‘cmo-secrets-erin-cresta’ saved [95519]

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ l
all-around-the-mulberry-bush.txt  hokey-pokey.txt         README.txt
cmo-secrets-erin-cresta           jack-and-jill.txt       roses-are-red.txt
hickory-dickory-dock.txt          old-mother-hubbard.txt  twinkle-twinkle.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ add hickory-dickory-dock.txt

Command 'add' not found, did you mean:

  command 'ddd' from deb ddd (1:3.3.12-5.2build1)
  command 'tdd' from deb devtodo (0.1.20-7build1)
  command 'pdd' from deb pdd (1.4-2)
  command 'amd' from deb am-utils (6.2+rc20110530-3.2ubuntu2)
  command 'aid' from deb id-utils (4.6+git20120811-4ubuntu2)
  command 'ad' from deb netatalk (3.1.12~ds-4)
  command 'axd' from deb afnix (2.9.2-2build1)
  command 'ldd' from deb libc-bin (2.31-0ubuntu9)
  command 'adb' from deb adb (1:8.1.0+r23-5ubuntu2)
  command 'atd' from deb at (3.1.23-1ubuntu1)
  command 'dad' from deb debian-dad (1)
  command 'dd' from deb coreutils (8.30-3ubuntu2)

Try: sudo apt install <deb name>

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add hickory-dickory-dock.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -m 'added hikory-dickory-dock.txt'
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git status
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ l
all-around-the-mulberry-bush.txt  hokey-pokey.txt         README.txt
cmo-secrets-erin-cresta           jack-and-jill.txt       roses-are-red.txt
hickory-dickory-dock.txt          old-mother-hubbard.txt  twinkle-twinkle.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ cd ..
zeon@Latitude:~/Documents/Boothcamp/rhymes$ l
README.txt  rhymes/
zeon@Latitude:~/Documents/Boothcamp/rhymes$ cd rhymes/
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ l
all-around-the-mulberry-bush.txt  hokey-pokey.txt         README.txt
cmo-secrets-erin-cresta           jack-and-jill.txt       roses-are-red.txt
hickory-dickory-dock.txt          old-mother-hubbard.txt  twinkle-twinkle.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ got remote rename original alice

Command 'got' not found, but there are 17 similar ones.

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote rename original alice
fatal: No such remote: 'original'
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote rename origin alice
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote add bob https://bryanhirsch/rhymes.git
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote
alice
bob
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote -v
alice	https://github.com/bryanhirsch/rhymes.git (fetch)
alice	https://github.com/bryanhirsch/rhymes.git (push)
bob	https://bryanhirsch/rhymes.git (fetch)
bob	https://bryanhirsch/rhymes.git (push)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote add bob https://github.com/bryanhirsch/rhymes.git
fatal: remote bob already exists.
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote rm bob
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote add bob https://github.com/bryanhirsch/rhymes.git
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote -v
alice	https://github.com/bryanhirsch/rhymes.git (fetch)
alice	https://github.com/bryanhirsch/rhymes.git (push)
bob	https://github.com/bryanhirsch/rhymes.git (fetch)
bob	https://github.com/bryanhirsch/rhymes.git (push)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git fetch bob
From https://github.com/bryanhirsch/rhymes
 * [new branch]      master     -> bob/master
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git branch -a
* hickory-dickory
  master
  remotes/alice/HEAD -> alice/master
  remotes/alice/master
  remotes/bob/master
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git checkout -b hickory-dickory bob/hickory-dickory
fatal: 'bob/hickory-dickory' is not a commit and a branch 'hickory-dickory' cannot be created from it
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git diff master hickory-dickory
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git log -1 -p
commit ba50852e6f8d094ab6d93908a5fda11a911e6e93 (HEAD -> hickory-dickory, bob/master, alice/master, alice/HEAD, master)
Author: Bryan Hirsch <bryan@bryanhirsch.com>
Date:   Mon Jun 8 13:09:27 2015 -0400

    Added government version of roses are red.
    
            new file:   roses-are-red.txt

diff --git a/roses-are-red.txt b/roses-are-red.txt
new file mode 100644
index 0000000..efba165
--- /dev/null
+++ b/roses-are-red.txt
@@ -0,0 +1,8 @@
+Roses are red
+-------------
+
+Roses are red
+Violets are blue
+Nobody loves GitHub
+More than government agencies do!
+
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git ceheckout master
git: 'ceheckout' is not a git command. See 'git --help'.

The most similar command is
	checkout
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git merge hickory-dickory
Already up to date.
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git branch -D hickory-dickory
error: Cannot delete branch 'hickory-dickory' checked out at '/home/zeon/Documents/Boothcamp/rhymes/rhymes'
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote rename origin bob
fatal: No such remote: 'origin'
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ cd ..
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git remote rename origin bob
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git remote add alice https://github.com/bryanhirsch/rhymes.git
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git remote
alice
bob
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git remote -v
alice	https://github.com/bryanhirsch/rhymes.git (fetch)
alice	https://github.com/bryanhirsch/rhymes.git (push)
bob	https://github.com/hamkasatria/rhymes.git (fetch)
bob	https://github.com/hamkasatria/rhymes.git (push)
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git remote update
Fetching bob
Fetching alice
warning: no common commits
remote: Enumerating objects: 23, done.
remote: Total 23 (delta 0), reused 0 (delta 0), pack-reused 23
Unpacking objects: 100% (23/23), 2.81 KiB | 287.00 KiB/s, done.
From https://github.com/bryanhirsch/rhymes
 * [new branch]      master     -> alice/master
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git checkout master
Already on 'master'
Your branch is up to date with 'bob/master'.
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git merge alice/master
fatal: refusing to merge unrelated histories
zeon@Latitude:~/Documents/Boothcamp/rhymes$ get diff alice/master

Command 'get' not found, but there are 18 similar ones.

zeon@Latitude:~/Documents/Boothcamp/rhymes$ git diff alice/master
diff --git a/README.txt b/README.txt
index c83e022..55ce3e9 100644
--- a/README.txt
+++ b/README.txt
@@ -1 +1 @@
-This repo is a collection of my favorite nursery rhymes.
+This repo is a collection of my favorite nursety rhymes.
diff --git a/all-around-the-mulberry-bush.txt b/all-around-the-mulberry-bush.txt
deleted file mode 100644
index b77d989..0000000
--- a/all-around-the-mulberry-bush.txt
+++ /dev/null
@@ -1,19 +0,0 @@
-All around the mulberry bush
-The monkey chased the weasel.
-The monkey thought 'twas all in fun.
-Pop! goes the weasel.
-
-A penny for a spool of thread,
-A penny for a needle.
-That's the way the money goes.
-Pop! goes the weasel.
-
-Up and down the City Road,
-In and out of the Eagle,
-That's the way the money goes.
-Pop! goes the weasel.
-
-Half a pound of tuppenney rice,
-Half a pound of treacle,
-Mix it up and make it nice,
-Pop! goes the weasel.
diff --git a/hickory-dickory-dock.txt b/hickory-dickory-dock.txt
deleted file mode 100644
index a337f4c..0000000
--- a/hickory-dickory-dock.txt
+++ /dev/null
@@ -1,5 +0,0 @@
-Hickory, dickory, dock,
-The mouse ran up the clock.
-The clock struck one,
-The mouse ran down!

zeon@Latitude:~/Documents/Boothcamp/rhymes$ git push bob master
Username for 'https://github.com': hamkasatria
Password for 'https://hamkasatria@github.com': 
Everything up-to-date
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git checkout -b bobs-changes
Switched to a new branch 'bobs-changes'
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git add jack-be-nimble.txt
fatal: pathspec 'jack-be-nimble.txt' did not match any files
zeon@Latitude:~/Documents/Boothcamp/rhymes$ l
README.txt  rhymes/
zeon@Latitude:~/Documents/Boothcamp/rhymes$ cd rhymes/
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add jack-be-nimble.txt
fatal: pathspec 'jack-be-nimble.txt' did not match any files
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ l
all-around-the-mulberry-bush.txt  hokey-pokey.txt         README.txt
cmo-secrets-erin-cresta           jack-and-jill.txt       roses-are-red.txt
hickory-dickory-dock.txt          old-mother-hubbard.txt  twinkle-twinkle.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ wget https://www.acquia.com/sites/default/files/blog/jack-be-nimble.txt
--2020-08-15 11:51:22--  https://www.acquia.com/sites/default/files/blog/jack-be-nimble.txt
Resolving www.acquia.com (www.acquia.com)... 104.16.117.45, 104.16.118.45, 2606:4700::6810:752d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.117.45|:443... connected.
HTTP request sent, awaiting response... 404 Not Found
2020-08-15 11:51:23 ERROR 404: Not Found.

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ l
all-around-the-mulberry-bush.txt  hokey-pokey.txt         README.txt
cmo-secrets-erin-cresta           jack-and-jill.txt       roses-are-red.txt
hickory-dickory-dock.txt          old-mother-hubbard.txt  twinkle-twinkle.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ touch jack-be-nimble.txt moother-goose.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add jack-be-nimble.txt 
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -m 'added jack-be-nimble.txt'
[hickory-dickory 0e588b1] added jack-be-nimble.txt
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 jack-be-nimble.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes$ wget https://www.acquia.com/sites/default/files/blog/hokey-pokey.txt 
--2020-08-15 11:15:07--  https://www.acquia.com/sites/default/files/blog/hokey-pokey.txt
Resolving www.acquia.com (www.acquia.com)... 104.16.117.45, 104.16.118.45, 2606:4700::6810:762d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.117.45|:443... connected.
HTTP request sent, awaiting response... 404 Not Found
2020-08-15 11:15:08 ERROR 404: Not Found.

zeon@Latitude:~/Documents/Boothcamp/rhymes$ git status
On branch master
nothing to commit, working tree clean
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git log
commit 1ac11c82c1977c782a56dedf7b868ed11eabaf1a (HEAD -> master)
Author: hamkasatria <muhhamkasatrianto@gmail.com>
Date:   Sat Aug 15 11:13:43 2020 +0700

    Added project overview to README.txt

commit 824a1afb77bfc19fa9b662685f607630e0b30775
Author: hamkasatria <muhhamkasatrianto@gmail.com>
Date:   Sat Aug 15 11:11:20 2020 +0700

    First commit
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git log -oneline
fatal: unrecognized argument: -oneline
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git log --oneline
1ac11c8 (HEAD -> master) Added project overview to README.txt
824a1af First commit
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git log -p
commit 1ac11c82c1977c782a56dedf7b868ed11eabaf1a (HEAD -> master)
Author: hamkasatria <muhhamkasatrianto@gmail.com>
Date:   Sat Aug 15 11:13:43 2020 +0700

    Added project overview to README.txt

diff --git a/README.txt b/README.txt
index e69de29..55ce3e9 100644
--- a/README.txt
+++ b/README.txt
@@ -0,0 +1 @@
+This repo is a collection of my favorite nursety rhymes.

commit 824a1afb77bfc19fa9b662685f607630e0b30775
Author: hamkasatria <muhhamkasatrianto@gmail.com>
Date:   Sat Aug 15 11:11:20 2020 +0700

    First commit

diff --git a/README.txt b/README.txt
new file mode 100644
index 0000000..e69de29
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git remote add origin https://github.com/hamkasatria/rhymes.git
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git push -u origin master
Username for 'https://github.com': hamkasatria
Password for 'https://hamkasatria@github.com': 
remote: Repository not found.
fatal: repository 'https://github.com/hamkasatria/rhymes.git/' not found
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git push -u origin master
Username for 'https://github.com': hamkasatria
Password for 'https://hamkasatria@github.com': 
Enumerating objects: 6, done.
Counting objects: 100% (6/6), done.
Delta compression using up to 4 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (6/6), 506 bytes | 506.00 KiB/s, done.
Total 6 (delta 0), reused 0 (delta 0)
To https://github.com/hamkasatria/rhymes.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git clone https://github.com/bryanhirsch/rhymes.git
Cloning into 'rhymes'...
remote: Enumerating objects: 23, done.
remote: Total 23 (delta 0), reused 0 (delta 0), pack-reused 23
Unpacking objects: 100% (23/23), 2.81 KiB | 575.00 KiB/s, done.
zeon@Latitude:~/Documents/Boothcamp/rhymes$ cd rhymes
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git checkout -b hickory-dickory
Switched to a new branch 'hickory-dickory'
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ wget https://https://www.acquia.com/blog/why-effective-marketing-requires-foundation-unified-customer-intelligence.txt
--2020-08-15 11:28:42--  https://https//www.acquia.com/blog/why-effective-marketing-requires-foundation-unified-customer-intelligence.txt
Resolving https (https)... failed: Temporary failure in name resolution.
wget: unable to resolve host address ‘https’
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ wget https://www.acquia.com/blog/why-effective-marketing-requires-foundation-unified-customer-intelligence.txt
--2020-08-15 11:29:01--  https://www.acquia.com/blog/why-effective-marketing-requires-foundation-unified-customer-intelligence.txt
Resolving www.acquia.com (www.acquia.com)... 104.16.118.45, 104.16.117.45, 2606:4700::6810:752d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.118.45|:443... connected.
HTTP request sent, awaiting response... 404 Not Found
2020-08-15 11:29:02 ERROR 404: Not Found.

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ wget https://www.acquia.com/blog/cmo-secrets-erin-cresta
--2020-08-15 11:30:18--  https://www.acquia.com/blog/cmo-secrets-erin-cresta
Resolving www.acquia.com (www.acquia.com)... 104.16.118.45, 104.16.117.45, 2606:4700::6810:762d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.118.45|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: unspecified [text/html]
Saving to: ‘cmo-secrets-erin-cresta’

cmo-secrets-erin-cr     [    <=>             ]  93,28K  51,9KB/s    in 1,8s    

2020-08-15 11:30:20 (51,9 KB/s) - ‘cmo-secrets-erin-cresta’ saved [95519]

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ l
all-around-the-mulberry-bush.txt  hokey-pokey.txt         README.txt
cmo-secrets-erin-cresta           jack-and-jill.txt       roses-are-red.txt
hickory-dickory-dock.txt          old-mother-hubbard.txt  twinkle-twinkle.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ add hickory-dickory-dock.txt

Command 'add' not found, did you mean:

  command 'ddd' from deb ddd (1:3.3.12-5.2build1)
  command 'tdd' from deb devtodo (0.1.20-7build1)
  command 'pdd' from deb pdd (1.4-2)
  command 'amd' from deb am-utils (6.2+rc20110530-3.2ubuntu2)
  command 'aid' from deb id-utils (4.6+git20120811-4ubuntu2)
  command 'ad' from deb netatalk (3.1.12~ds-4)
  command 'axd' from deb afnix (2.9.2-2build1)
  command 'ldd' from deb libc-bin (2.31-0ubuntu9)
  command 'adb' from deb adb (1:8.1.0+r23-5ubuntu2)
  command 'atd' from deb at (3.1.23-1ubuntu1)
  command 'dad' from deb debian-dad (1)
  command 'dd' from deb coreutils (8.30-3ubuntu2)

Try: sudo apt install <deb name>

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add hickory-dickory-dock.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -m 'added hikory-dickory-dock.txt'
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git status
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ l
all-around-the-mulberry-bush.txt  hokey-pokey.txt         README.txt
cmo-secrets-erin-cresta           jack-and-jill.txt       roses-are-red.txt
hickory-dickory-dock.txt          old-mother-hubbard.txt  twinkle-twinkle.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ cd ..
zeon@Latitude:~/Documents/Boothcamp/rhymes$ l
README.txt  rhymes/
zeon@Latitude:~/Documents/Boothcamp/rhymes$ cd rhymes/
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ l
all-around-the-mulberry-bush.txt  hokey-pokey.txt         README.txt
cmo-secrets-erin-cresta           jack-and-jill.txt       roses-are-red.txt
hickory-dickory-dock.txt          old-mother-hubbard.txt  twinkle-twinkle.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ got remote rename original alice

Command 'got' not found, but there are 17 similar ones.

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote rename original alice
fatal: No such remote: 'original'
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote rename origin alice
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote add bob https://bryanhirsch/rhymes.git
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote
alice
bob
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote -v
alice	https://github.com/bryanhirsch/rhymes.git (fetch)
alice	https://github.com/bryanhirsch/rhymes.git (push)
bob	https://bryanhirsch/rhymes.git (fetch)
bob	https://bryanhirsch/rhymes.git (push)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote add bob https://github.com/bryanhirsch/rhymes.git
fatal: remote bob already exists.
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote rm bob
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote add bob https://github.com/bryanhirsch/rhymes.git
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote -v
alice	https://github.com/bryanhirsch/rhymes.git (fetch)
alice	https://github.com/bryanhirsch/rhymes.git (push)
bob	https://github.com/bryanhirsch/rhymes.git (fetch)
bob	https://github.com/bryanhirsch/rhymes.git (push)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git fetch bob
From https://github.com/bryanhirsch/rhymes
 * [new branch]      master     -> bob/master
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git branch -a
* hickory-dickory
  master
  remotes/alice/HEAD -> alice/master
  remotes/alice/master
  remotes/bob/master
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git checkout -b hickory-dickory bob/hickory-dickory
fatal: 'bob/hickory-dickory' is not a commit and a branch 'hickory-dickory' cannot be created from it
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git diff master hickory-dickory
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git log -1 -p
commit ba50852e6f8d094ab6d93908a5fda11a911e6e93 (HEAD -> hickory-dickory, bob/master, alice/master, alice/HEAD, master)
Author: Bryan Hirsch <bryan@bryanhirsch.com>
Date:   Mon Jun 8 13:09:27 2015 -0400

    Added government version of roses are red.
    
            new file:   roses-are-red.txt

diff --git a/roses-are-red.txt b/roses-are-red.txt
new file mode 100644
index 0000000..efba165
--- /dev/null
+++ b/roses-are-red.txt
@@ -0,0 +1,8 @@
+Roses are red
+-------------
+
+Roses are red
+Violets are blue
+Nobody loves GitHub
+More than government agencies do!
+
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git ceheckout master
git: 'ceheckout' is not a git command. See 'git --help'.

The most similar command is
	checkout
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git merge hickory-dickory
Already up to date.
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git branch -D hickory-dickory
error: Cannot delete branch 'hickory-dickory' checked out at '/home/zeon/Documents/Boothcamp/rhymes/rhymes'
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git remote rename origin bob
fatal: No such remote: 'origin'
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ cd ..
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git remote rename origin bob
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git remote add alice https://github.com/bryanhirsch/rhymes.git
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git remote
alice
bob
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git remote -v
alice	https://github.com/bryanhirsch/rhymes.git (fetch)
alice	https://github.com/bryanhirsch/rhymes.git (push)
bob	https://github.com/hamkasatria/rhymes.git (fetch)
bob	https://github.com/hamkasatria/rhymes.git (push)
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git remote update
Fetching bob
Fetching alice
warning: no common commits
remote: Enumerating objects: 23, done.
remote: Total 23 (delta 0), reused 0 (delta 0), pack-reused 23
Unpacking objects: 100% (23/23), 2.81 KiB | 287.00 KiB/s, done.
From https://github.com/bryanhirsch/rhymes
 * [new branch]      master     -> alice/master
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git checkout master
Already on 'master'
Your branch is up to date with 'bob/master'.
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git merge alice/master
fatal: refusing to merge unrelated histories
zeon@Latitude:~/Documents/Boothcamp/rhymes$ get diff alice/master

Command 'get' not found, but there are 18 similar ones.

zeon@Latitude:~/Documents/Boothcamp/rhymes$ git diff alice/master
diff --git a/README.txt b/README.txt
index c83e022..55ce3e9 100644
--- a/README.txt
+++ b/README.txt
@@ -1 +1 @@
-This repo is a collection of my favorite nursery rhymes.
+This repo is a collection of my favorite nursety rhymes.
diff --git a/all-around-the-mulberry-bush.txt b/all-around-the-mulberry-bush.txt
deleted file mode 100644
index b77d989..0000000
--- a/all-around-the-mulberry-bush.txt
+++ /dev/null
@@ -1,19 +0,0 @@
-All around the mulberry bush
-The monkey chased the weasel.
-The monkey thought 'twas all in fun.
-Pop! goes the weasel.
-
-A penny for a spool of thread,
-A penny for a needle.
-That's the way the money goes.
-Pop! goes the weasel.
-
-Up and down the City Road,
-In and out of the Eagle,
-That's the way the money goes.
-Pop! goes the weasel.
-
-Half a pound of tuppenney rice,
-Half a pound of treacle,
-Mix it up and make it nice,
-Pop! goes the weasel.
diff --git a/hickory-dickory-dock.txt b/hickory-dickory-dock.txt
deleted file mode 100644
index a337f4c..0000000
--- a/hickory-dickory-dock.txt
+++ /dev/null
@@ -1,5 +0,0 @@
-Hickory, dickory, dock,
-The mouse ran up the clock.
-The clock struck one,
-The mouse ran down!

zeon@Latitude:~/Documents/Boothcamp/rhymes$ git push bob master
Username for 'https://github.com': hamkasatria
Password for 'https://hamkasatria@github.com': 
Everything up-to-date
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git checkout -b bobs-changes
Switched to a new branch 'bobs-changes'
zeon@Latitude:~/Documents/Boothcamp/rhymes$ git add jack-be-nimble.txt
fatal: pathspec 'jack-be-nimble.txt' did not match any files
zeon@Latitude:~/Documents/Boothcamp/rhymes$ l
README.txt  rhymes/
zeon@Latitude:~/Documents/Boothcamp/rhymes$ cd rhymes/
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add jack-be-nimble.txt
fatal: pathspec 'jack-be-nimble.txt' did not match any files
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ l
all-around-the-mulberry-bush.txt  hokey-pokey.txt         README.txt
cmo-secrets-erin-cresta           jack-and-jill.txt       roses-are-red.txt
hickory-dickory-dock.txt          old-mother-hubbard.txt  twinkle-twinkle.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ wget https://www.acquia.com/sites/default/files/blog/jack-be-nimble.txt
--2020-08-15 11:51:22--  https://www.acquia.com/sites/default/files/blog/jack-be-nimble.txt
Resolving www.acquia.com (www.acquia.com)... 104.16.117.45, 104.16.118.45, 2606:4700::6810:752d, ...
Connecting to www.acquia.com (www.acquia.com)|104.16.117.45|:443... connected.
HTTP request sent, awaiting response... 404 Not Found
2020-08-15 11:51:23 ERROR 404: Not Found.

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ l
all-around-the-mulberry-bush.txt  hokey-pokey.txt         README.txt
cmo-secrets-erin-cresta           jack-and-jill.txt       roses-are-red.txt
hickory-dickory-dock.txt          old-mother-hubbard.txt  twinkle-twinkle.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ touch jack-be-nimble.txt moother-goose.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add jack-be-nimble.txt 
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -m 'added jack-be-nimble.txt'
[hickory-dickory 0e588b1] added jack-be-nimble.txt
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 jack-be-nimble.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add mother-goose.txt
fatal: pathspec 'mother-goose.txt' did not match any files
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -m 'Added mother-goose,txt'
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta
	moother-goose.txt

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -am 'Update RESDME.txt'
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta
	moother-goose.txt

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git diff --word-diff
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -am 'Fixed typo in README.txt'
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta
	moother-goose.txt

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -am 'Updated README.txt'
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta
	moother-goose.txt

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ touch old-king-cole.txt twinkle-twinkle.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add old-king-cole.txt commit -m 'added old king cole'
error: unknown switch `m'
usage: git add [<options>] [--] <pathspec>...

    -n, --dry-run         dry run
    -v, --verbose         be verbose

    -i, --interactive     interactive picking
    -p, --patch           select hunks interactively
    -e, --edit            edit current diff and apply
    -f, --force           allow adding otherwise ignored files
    -u, --update          update tracked files
    --renormalize         renormalize EOL of tracked files (implies -u)
    -N, --intent-to-add   record only the fact that the path will be added later
    -A, --all             add changes from all tracked and untracked files
    --ignore-removal      ignore paths removed in the working tree (same as --no-all)
    --refresh             don't add, only refresh the index
    --ignore-errors       just skip files which cannot be added because of errors
    --ignore-missing      check if - even missing - files are ignored in dry run
    --chmod (+|-)x        override the executable bit of the listed files
    --pathspec-from-file <file>
                          read pathspec from file
    --pathspec-file-nul   with --pathspec-from-file, pathspec elements are separated with NUL character

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add old-king-cole.txt commit -m 'added old-king-cole.txt'
error: unknown switch `m'
usage: git add [<options>] [--] <pathspec>...

    -n, --dry-run         dry run
    -v, --verbose         be verbose

    -i, --interactive     interactive picking
    -p, --patch           select hunks interactively
    -e, --edit            edit current diff and apply
    -f, --force           allow adding otherwise ignored files
    -u, --update          update tracked files
    --renormalize         renormalize EOL of tracked files (implies -u)
    -N, --intent-to-add   record only the fact that the path will be added later
    -A, --all             add changes from all tracked and untracked files
    --ignore-removal      ignore paths removed in the working tree (same as --no-all)
    --refresh             don't add, only refresh the index
    --ignore-errors       just skip files which cannot be added because of errors
    --ignore-missing      check if - even missing - files are ignored in dry run
    --chmod (+|-)x        override the executable bit of the listed files
    --pathspec-from-file <file>
                          read pathspec from file
    --pathspec-file-nul   with --pathspec-from-file, pathspec elements are separated with NUL character

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add old-king-cole.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -m 'Added old-king-cole.txt'
[hickory-dickory d2d138a] Added old-king-cole.txt
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 old-king-cole.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add twinkle-twinkle.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -m 'Added twinkle-twinkle.txt.'
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta
	moother-goose.txt

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -am 'Updated README.txt.'
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta
	moother-goose.txt

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git log git log --oneline 
fatal: ambiguous argument 'git': unknown revision or path not in the working tree.
Use '--' to separate paths from revisions, like this:
'git <command> [<revision>...] -- [<file>...]'
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git log --oneline
d2d138a (HEAD -> hickory-dickory) Added old-king-cole.txt
0e588b1 added jack-be-nimble.txt
ba50852 (bob/master, alice/master, alice/HEAD, master) Added government version of roses are red.
4b15370 Added hickory-dickory-dock.txt.
4ada881 Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt
10e0e68 Added jack-and-jill.txt.
6a69e0f Added all-around-the-mulberry-bush.txt.
d30493a Added project overview to README.txt
710f4bd First commit.
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git rebase -i 4b15370
[detached HEAD 1cb523d] added jack-be-nimble.txt
 Date: Sat Aug 15 11:52:38 2020 +0700
 2 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 jack-be-nimble.txt
 create mode 100644 old-king-cole.txt
Successfully rebased and updated refs/heads/hickory-dickory.
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ 

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add mother-goose.txt
fatal: pathspec 'mother-goose.txt' did not match any files
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -m 'Added mother-goose,txt'
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta
	moother-goose.txt

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -am 'Update RESDME.txt'
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta
	moother-goose.txt

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git diff --word-diff
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -am 'Fixed typo in README.txt'
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta
	moother-goose.txt

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -am 'Updated README.txt'
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta
	moother-goose.txt

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ touch old-king-cole.txt twinkle-twinkle.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add old-king-cole.txt commit -m 'added old king cole'
error: unknown switch `m'
usage: git add [<options>] [--] <pathspec>...

    -n, --dry-run         dry run
    -v, --verbose         be verbose

    -i, --interactive     interactive picking
    -p, --patch           select hunks interactively
    -e, --edit            edit current diff and apply
    -f, --force           allow adding otherwise ignored files
    -u, --update          update tracked files
    --renormalize         renormalize EOL of tracked files (implies -u)
    -N, --intent-to-add   record only the fact that the path will be added later
    -A, --all             add changes from all tracked and untracked files
    --ignore-removal      ignore paths removed in the working tree (same as --no-all)
    --refresh             don't add, only refresh the index
    --ignore-errors       just skip files which cannot be added because of errors
    --ignore-missing      check if - even missing - files are ignored in dry run
    --chmod (+|-)x        override the executable bit of the listed files
    --pathspec-from-file <file>
                          read pathspec from file
    --pathspec-file-nul   with --pathspec-from-file, pathspec elements are separated with NUL character

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add old-king-cole.txt commit -m 'added old-king-cole.txt'
error: unknown switch `m'
usage: git add [<options>] [--] <pathspec>...

    -n, --dry-run         dry run
    -v, --verbose         be verbose

    -i, --interactive     interactive picking
    -p, --patch           select hunks interactively
    -e, --edit            edit current diff and apply
    -f, --force           allow adding otherwise ignored files
    -u, --update          update tracked files
    --renormalize         renormalize EOL of tracked files (implies -u)
    -N, --intent-to-add   record only the fact that the path will be added later
    -A, --all             add changes from all tracked and untracked files
    --ignore-removal      ignore paths removed in the working tree (same as --no-all)
    --refresh             don't add, only refresh the index
    --ignore-errors       just skip files which cannot be added because of errors
    --ignore-missing      check if - even missing - files are ignored in dry run
    --chmod (+|-)x        override the executable bit of the listed files
    --pathspec-from-file <file>
                          read pathspec from file
    --pathspec-file-nul   with --pathspec-from-file, pathspec elements are separated with NUL character

zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add old-king-cole.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -m 'Added old-king-cole.txt'
[hickory-dickory d2d138a] Added old-king-cole.txt
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 old-king-cole.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git add twinkle-twinkle.txt
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -m 'Added twinkle-twinkle.txt.'
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta
	moother-goose.txt

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git commit -am 'Updated README.txt.'
On branch hickory-dickory
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	cmo-secrets-erin-cresta
	moother-goose.txt

nothing added to commit but untracked files present (use "git add" to track)
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git log git log --oneline 
fatal: ambiguous argument 'git': unknown revision or path not in the working tree.
Use '--' to separate paths from revisions, like this:
'git <command> [<revision>...] -- [<file>...]'
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git log --oneline
d2d138a (HEAD -> hickory-dickory) Added old-king-cole.txt
0e588b1 added jack-be-nimble.txt
ba50852 (bob/master, alice/master, alice/HEAD, master) Added government version of roses are red.
4b15370 Added hickory-dickory-dock.txt.
4ada881 Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt
10e0e68 Added jack-and-jill.txt.
6a69e0f Added all-around-the-mulberry-bush.txt.
d30493a Added project overview to README.txt
710f4bd First commit.
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ git rebase -i 4b15370
[detached HEAD 1cb523d] added jack-be-nimble.txt
 Date: Sat Aug 15 11:52:38 2020 +0700
 2 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 jack-be-nimble.txt
 create mode 100644 old-king-cole.txt
Successfully rebased and updated refs/heads/hickory-dickory.
zeon@Latitude:~/Documents/Boothcamp/rhymes/rhymes$ 


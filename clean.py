import requests
import json
import datetime

# Github access token
access_token = "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"

repo_owner = "Ghassen-Oueslati-Keyrus"
repo_name = "ALINFO10_G2"

hours_inactive = 1

base_url = "https://api.github.com"

response = requests.get(f"{base_url}/repos/{repo_owner}/{repo_name}/branches?access_token={access_token}")
branches = json.loads(response.text)

# Iterate through the branches
for branch in branches:
    branch_name = branch["name"]
    branch_commit = branch["commit"]["sha"]
    response = requests.get(f"{base_url}/repos/{repo_owner}/{repo_name}/commits/{branch_commit}?access_token={access_token}")
    commit_date = json.loads(response.text)["commit"]["committer"]["date"]
    date_format = "%Y-%m-%dT%H:%M:%SZ"
    commit_time = datetime.datetime.strptime(commit_date, date_format)
    current_time = datetime.datetime.now()
    hours_diff = (current_time - commit_time).total_seconds() / 3600

    if hours_diff > hours_inactive:
        response = requests.delete(f"{base_url}/repos/{repo_owner}/{repo_name}/git/refs/heads/{branch_name}?access_token={access_token}")
        print(f"Deleted branch '{branch_name}': {response.status_code}")
# 0458 — Join

Define two Exposed `Table` objects, `users` and `posts`, where `posts.user_id` `references` `users.id`, over an in-memory SQLite database. Insert the users and posts, then use the JetBrains Exposed DSL `innerJoin` to join `posts` to `users` and `select` the `name` and `title` columns, ordered by name then title with `orderBy`. Each joined row is printed as `name title`.

## Run

    kotlin Join.main.kts

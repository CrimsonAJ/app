.class public final Lco/notix/ab;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/y8;

.field public final b:Lg8/a;


# direct methods
.method public constructor <init>(Lco/notix/d9;)V
    .locals 1

    const-string v0, "contextProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/ab;->a:Lco/notix/y8;

    invoke-static {}, Lg8/e;->a()Lg8/d;

    move-result-object p1

    iput-object p1, p0, Lco/notix/ab;->b:Lg8/a;

    return-void
.end method


# virtual methods
.method public final a(JLE7/d;)Ljava/lang/Object;
    .locals 4

    .line 9
    instance-of v0, p3, Lco/notix/ya;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lco/notix/ya;

    iget v1, v0, Lco/notix/ya;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/ya;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/ya;

    invoke-direct {v0, p0, p3}, Lco/notix/ya;-><init>(Lco/notix/ab;LE7/d;)V

    :goto_0
    iget-object p3, v0, Lco/notix/ya;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/ya;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    iput v3, v0, Lco/notix/ya;->c:I

    invoke-virtual {p0, p1, p2, v0}, Lco/notix/ab;->b(JLE7/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ll6/f;

    const-class p1, Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-virtual {p3, p1}, Ll6/f;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "getFirebaseApp(senderId)\u2026aseMessaging::class.java)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final a()Ll6/f;
    .locals 6

    .line 1
    iget-object v0, p0, Lco/notix/ab;->a:Lco/notix/y8;

    check-cast v0, Lco/notix/d9;

    invoke-virtual {v0}, Lco/notix/d9;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lco/notix/R$string;->notix_public_app_name:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(R.string.notix_public_app_name)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v1, Ll6/f;->k:Ljava/lang/Object;

    monitor-enter v1

    .line 3
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    sget-object v3, Ll6/f;->l:Ls/e;

    invoke-virtual {v3}, Ls/e;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    :cond_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    move-object v5, v4

    check-cast v5, Ll6/f;

    .line 5
    invoke-virtual {v5}, Ll6/f;->a()V

    .line 6
    iget-object v5, v5, Ll6/f;->b:Ljava/lang/String;

    .line 7
    invoke-static {v5, v0}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    check-cast v4, Ll6/f;

    return-object v4

    :catchall_0
    move-exception v0

    .line 8
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final a(J)Ll6/f;
    .locals 11

    .line 10
    iget-object v0, p0, Lco/notix/ab;->a:Lco/notix/y8;

    check-cast v0, Lco/notix/d9;

    invoke-virtual {v0}, Lco/notix/d9;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lco/notix/R$string;->notix_public_app_name:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "context.getString(R.string.notix_public_app_name)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lco/notix/R$string;->notix_public_app_id:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v2, "context.getString(R.string.notix_public_app_id)"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lco/notix/R$string;->notix_public_api_key:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v2, "context.getString(R.string.notix_public_api_key)"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lco/notix/R$string;->notix_public_project_id:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    const-string v2, "context.getString(R.stri\u2026.notix_public_project_id)"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    .line 11
    const-string p1, "ApplicationId must be set."

    invoke-static {v4, p1}, LF4/y;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    const-string p1, "ApiKey must be set."

    invoke-static {v5, p1}, LF4/y;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    new-instance v3, Ll6/i;

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 14
    invoke-direct/range {v3 .. v10}, Ll6/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-static {v0, v1, v3}, Ll6/f;->g(Landroid/content/Context;Ljava/lang/String;Ll6/i;)Ll6/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(JLE7/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lco/notix/za;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lco/notix/za;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/za;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lco/notix/za;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/za;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lco/notix/za;-><init>(Lco/notix/ab;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lco/notix/za;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/za;->f:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-wide p1, v0, Lco/notix/za;->c:J

    .line 37
    .line 38
    iget-object v1, v0, Lco/notix/za;->b:Lg8/a;

    .line 39
    .line 40
    iget-object v0, v0, Lco/notix/za;->a:Lco/notix/ab;

    .line 41
    .line 42
    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p3, p0, Lco/notix/ab;->b:Lg8/a;

    .line 58
    .line 59
    iput-object p0, v0, Lco/notix/za;->a:Lco/notix/ab;

    .line 60
    .line 61
    iput-object p3, v0, Lco/notix/za;->b:Lg8/a;

    .line 62
    .line 63
    iput-wide p1, v0, Lco/notix/za;->c:J

    .line 64
    .line 65
    iput v3, v0, Lco/notix/za;->f:I

    .line 66
    .line 67
    invoke-interface {p3, v0}, Lg8/a;->d(LG7/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-ne v0, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    move-object v0, p0

    .line 75
    move-object v1, p3

    .line 76
    :goto_1
    const/4 p3, 0x0

    .line 77
    :try_start_0
    invoke-virtual {v0}, Lco/notix/ab;->a()Ll6/f;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    if-nez v2, :cond_4

    .line 82
    .line 83
    invoke-virtual {v0, p1, p2}, Lco/notix/ab;->a(J)Ll6/f;

    .line 84
    .line 85
    .line 86
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    goto :goto_2

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    goto :goto_3

    .line 90
    :cond_4
    :goto_2
    invoke-interface {v1, p3}, Lg8/a;->a(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-object v2

    .line 94
    :goto_3
    invoke-interface {v1, p3}, Lg8/a;->a(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    throw p1
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method

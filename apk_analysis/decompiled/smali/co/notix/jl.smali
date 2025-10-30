.class public final Lco/notix/jl;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lco/notix/kl;


# direct methods
.method public constructor <init>(Lco/notix/kl;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/notix/jl;->c:Lco/notix/kl;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LG7/j;-><init>(ILE7/d;)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LE7/d;)LE7/d;
    .locals 2

    .line 1
    new-instance v0, Lco/notix/jl;

    .line 2
    .line 3
    iget-object v1, p0, Lco/notix/jl;->c:Lco/notix/kl;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lco/notix/jl;-><init>(Lco/notix/kl;LE7/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lco/notix/jl;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lco/notix/jl;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lco/notix/jl;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lco/notix/jl;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, LF7/a;->a:LF7/a;

    .line 2
    .line 3
    iget v1, p0, Lco/notix/jl;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    :try_start_0
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    move-object p1, v0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lco/notix/jl;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, LY7/z;

    .line 31
    .line 32
    iget-object p1, p0, Lco/notix/jl;->c:Lco/notix/kl;

    .line 33
    .line 34
    :try_start_1
    iget-object v1, p1, Lco/notix/kl;->c:Lco/notix/xq;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lco/notix/xq;->a()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    if-eqz v7, :cond_3

    .line 44
    .line 45
    iget-object v1, p1, Lco/notix/kl;->c:Lco/notix/xq;

    .line 46
    .line 47
    invoke-virtual {v1}, Lco/notix/xq;->c()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iget-object v1, p1, Lco/notix/kl;->d:Lco/notix/y8;

    .line 52
    .line 53
    check-cast v1, Lco/notix/d9;

    .line 54
    .line 55
    invoke-virtual {v1}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    const-string v8, "0.1.86"

    .line 64
    .line 65
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 66
    .line 67
    iget-object v4, p1, Lco/notix/kl;->b:Lco/notix/cr;

    .line 68
    .line 69
    const-string p1, "packageName"

    .line 70
    .line 71
    invoke-static {v6, p1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput v2, p0, Lco/notix/jl;->a:I

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    sget-object p1, LY7/K;->b:Lf8/d;

    .line 80
    .line 81
    new-instance v3, Lco/notix/br;

    .line 82
    .line 83
    const/4 v10, 0x0

    .line 84
    invoke-direct/range {v3 .. v10}, Lco/notix/br;-><init>(Lco/notix/cr;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILE7/d;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1, v3, p0}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-ne p1, v0, :cond_2

    .line 92
    .line 93
    return-object v0

    .line 94
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    const-string v0, "unsubscribe - invalid data. appId = null"

    .line 100
    .line 101
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    :goto_1
    invoke-static {p1}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :goto_2
    iget-object v0, p0, Lco/notix/jl;->c:Lco/notix/kl;

    .line 110
    .line 111
    instance-of v1, p1, LA7/i;

    .line 112
    .line 113
    if-nez v1, :cond_4

    .line 114
    .line 115
    move-object v1, p1

    .line 116
    check-cast v1, Ljava/lang/String;

    .line 117
    .line 118
    iget-object v0, v0, Lco/notix/kl;->f:Lco/notix/og;

    .line 119
    .line 120
    new-instance v2, Lco/notix/callback/NotixCallback$Unsubscription;

    .line 121
    .line 122
    sget-object v3, Lco/notix/callback/NotixCallbackStatus;->SUCCESS:Lco/notix/callback/NotixCallbackStatus;

    .line 123
    .line 124
    invoke-direct {v2, v3, v1}, Lco/notix/callback/NotixCallback$Unsubscription;-><init>(Lco/notix/callback/NotixCallbackStatus;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v2}, Lco/notix/og;->a(Lco/notix/callback/NotixCallback;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    iget-object v0, p0, Lco/notix/jl;->c:Lco/notix/kl;

    .line 131
    .line 132
    invoke-static {p1}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-eqz v1, :cond_5

    .line 137
    .line 138
    iget-object v0, v0, Lco/notix/kl;->f:Lco/notix/og;

    .line 139
    .line 140
    new-instance v2, Lco/notix/callback/NotixCallback$Unsubscription;

    .line 141
    .line 142
    sget-object v3, Lco/notix/callback/NotixCallbackStatus;->FAILURE:Lco/notix/callback/NotixCallbackStatus;

    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-direct {v2, v3, v1}, Lco/notix/callback/NotixCallback$Unsubscription;-><init>(Lco/notix/callback/NotixCallbackStatus;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v2}, Lco/notix/og;->a(Lco/notix/callback/NotixCallback;)V

    .line 152
    .line 153
    .line 154
    :cond_5
    iget-object v0, p0, Lco/notix/jl;->c:Lco/notix/kl;

    .line 155
    .line 156
    invoke-static {p1}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    if-nez v1, :cond_6

    .line 161
    .line 162
    check-cast p1, Ljava/lang/String;

    .line 163
    .line 164
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iget-object p1, p1, Lco/notix/kd;->b:Lco/notix/x8;

    .line 170
    .line 171
    const-string v1, "unsubscribe success"

    .line 172
    .line 173
    invoke-virtual {p1, v1}, Lco/notix/x8;->a(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    iget-object p1, v0, Lco/notix/kl;->c:Lco/notix/xq;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-static {}, Lco/notix/xq;->d()V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_6
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    .line 186
    .line 187
    const-string v0, "unsubscribe failure"

    .line 188
    .line 189
    invoke-static {p1, v0, v1}, Lco/notix/yn;->a(Lco/notix/kd;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    .line 193
    .line 194
    return-object p1
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

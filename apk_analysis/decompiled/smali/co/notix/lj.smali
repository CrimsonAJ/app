.class public final Lco/notix/lj;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public a:Lg8/a;

.field public b:Lco/notix/perseverance/worker/PerseveranceWorker;

.field public c:I

.field public final synthetic d:Lco/notix/perseverance/worker/PerseveranceWorker;


# direct methods
.method public constructor <init>(Lco/notix/perseverance/worker/PerseveranceWorker;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/notix/lj;->d:Lco/notix/perseverance/worker/PerseveranceWorker;

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
    .locals 1

    .line 1
    new-instance p1, Lco/notix/lj;

    .line 2
    .line 3
    iget-object v0, p0, Lco/notix/lj;->d:Lco/notix/perseverance/worker/PerseveranceWorker;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lco/notix/lj;-><init>(Lco/notix/perseverance/worker/PerseveranceWorker;LE7/d;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lco/notix/lj;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lco/notix/lj;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lco/notix/lj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    const-string v0, "unrecoverable exception, clearing queue "

    .line 2
    .line 3
    sget-object v1, LF7/a;->a:LF7/a;

    .line 4
    .line 5
    iget v2, p0, Lco/notix/lj;->c:I

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    if-eqz v2, :cond_3

    .line 12
    .line 13
    if-eq v2, v5, :cond_2

    .line 14
    .line 15
    if-eq v2, v4, :cond_1

    .line 16
    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lco/notix/lj;->a:Lg8/a;

    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto/16 :goto_6

    .line 25
    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto/16 :goto_8

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    iget-object v2, p0, Lco/notix/lj;->b:Lco/notix/perseverance/worker/PerseveranceWorker;

    .line 38
    .line 39
    iget-object v4, p0, Lco/notix/lj;->a:Lg8/a;

    .line 40
    .line 41
    :try_start_1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :goto_0
    move-object v0, v4

    .line 46
    goto/16 :goto_8

    .line 47
    .line 48
    :catch_0
    move-exception p1

    .line 49
    goto :goto_4

    .line 50
    :cond_2
    iget-object v2, p0, Lco/notix/lj;->b:Lco/notix/perseverance/worker/PerseveranceWorker;

    .line 51
    .line 52
    iget-object v5, p0, Lco/notix/lj;->a:Lg8/a;

    .line 53
    .line 54
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-object p1, v5

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object p1, Lco/notix/perseverance/worker/PerseveranceWorker;->d:Lg8/a;

    .line 63
    .line 64
    iget-object v2, p0, Lco/notix/lj;->d:Lco/notix/perseverance/worker/PerseveranceWorker;

    .line 65
    .line 66
    iput-object p1, p0, Lco/notix/lj;->a:Lg8/a;

    .line 67
    .line 68
    iput-object v2, p0, Lco/notix/lj;->b:Lco/notix/perseverance/worker/PerseveranceWorker;

    .line 69
    .line 70
    iput v5, p0, Lco/notix/lj;->c:I

    .line 71
    .line 72
    invoke-interface {p1, p0}, Lg8/a;->d(LG7/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    if-ne v5, v1, :cond_4

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_4
    :goto_1
    :try_start_2
    iput-object p1, p0, Lco/notix/lj;->a:Lg8/a;

    .line 80
    .line 81
    iput-object v2, p0, Lco/notix/lj;->b:Lco/notix/perseverance/worker/PerseveranceWorker;

    .line 82
    .line 83
    iput v4, p0, Lco/notix/lj;->c:I

    .line 84
    .line 85
    invoke-static {v2, p0}, Lco/notix/perseverance/worker/PerseveranceWorker;->a(Lco/notix/perseverance/worker/PerseveranceWorker;LE7/d;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 89
    if-ne v4, v1, :cond_5

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_5
    move-object v8, v4

    .line 93
    move-object v4, p1

    .line 94
    move-object p1, v8

    .line 95
    :goto_2
    :try_start_3
    check-cast p1, Lco/notix/pr;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 96
    .line 97
    goto :goto_7

    .line 98
    :catchall_1
    move-exception p1

    .line 99
    goto :goto_0

    .line 100
    :catchall_2
    move-exception v0

    .line 101
    goto :goto_3

    .line 102
    :catch_1
    move-exception v4

    .line 103
    move-object v8, v4

    .line 104
    move-object v4, p1

    .line 105
    move-object p1, v8

    .line 106
    goto :goto_4

    .line 107
    :goto_3
    move-object v8, v0

    .line 108
    move-object v0, p1

    .line 109
    move-object p1, v8

    .line 110
    goto :goto_8

    .line 111
    :goto_4
    :try_start_4
    sget-object v5, Lco/notix/md;->a:Lco/notix/kd;

    .line 112
    .line 113
    new-instance v7, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v5, v0, p1}, Lco/notix/kd;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    iget-object p1, v2, Lco/notix/perseverance/worker/PerseveranceWorker;->b:Lco/notix/ej;

    .line 133
    .line 134
    iput-object v4, p0, Lco/notix/lj;->a:Lg8/a;

    .line 135
    .line 136
    iput-object v6, p0, Lco/notix/lj;->b:Lco/notix/perseverance/worker/PerseveranceWorker;

    .line 137
    .line 138
    iput v3, p0, Lco/notix/lj;->c:I

    .line 139
    .line 140
    invoke-virtual {p1, p0}, Lco/notix/ej;->a(LE7/d;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 144
    if-ne p1, v1, :cond_6

    .line 145
    .line 146
    :goto_5
    return-object v1

    .line 147
    :cond_6
    move-object v0, v4

    .line 148
    :goto_6
    :try_start_5
    sget-object p1, Lco/notix/or;->a:Lco/notix/or;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 149
    .line 150
    move-object v4, v0

    .line 151
    :goto_7
    invoke-interface {v4, v6}, Lg8/a;->a(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    return-object p1

    .line 155
    :goto_8
    invoke-interface {v0, v6}, Lg8/a;->a(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    throw p1
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

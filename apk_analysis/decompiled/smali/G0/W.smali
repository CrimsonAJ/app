.class public final LG0/W;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:LG0/X;


# direct methods
.method public constructor <init>(LG0/X;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG0/W;->t:LG0/X;

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
    new-instance v0, LG0/W;

    .line 2
    .line 3
    iget-object v1, p0, LG0/W;->t:LG0/X;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LG0/W;-><init>(LG0/X;LE7/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LG0/W;->s:Ljava/lang/Object;

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
    check-cast p1, LG0/K;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LG0/W;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LG0/W;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LG0/W;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, LF7/a;->a:LF7/a;

    .line 4
    .line 5
    iget v2, v1, LG0/W;->r:I

    .line 6
    .line 7
    sget-object v3, LA7/n;->a:LA7/n;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    if-eq v2, v4, :cond_1

    .line 14
    .line 15
    if-ne v2, v5, :cond_0

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v3

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_1
    iget-object v2, v1, LG0/W;->s:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, LG0/K;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object/from16 v6, p1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v2, v1, LG0/W;->s:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, LG0/K;

    .line 45
    .line 46
    iput-object v2, v1, LG0/W;->s:Ljava/lang/Object;

    .line 47
    .line 48
    iput v4, v1, LG0/W;->r:I

    .line 49
    .line 50
    invoke-interface {v2, v1}, LG0/K;->b(LG7/j;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    if-ne v6, v0, :cond_3

    .line 55
    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :cond_3
    :goto_0
    check-cast v6, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    goto/16 :goto_8

    .line 67
    .line 68
    :cond_4
    iget-object v6, v1, LG0/W;->t:LG0/X;

    .line 69
    .line 70
    iget-object v7, v6, LG0/X;->h:LA6/t;

    .line 71
    .line 72
    iget-object v8, v7, LA6/t;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v8, [J

    .line 75
    .line 76
    iget-object v9, v7, LA6/t;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v9, Ljava/util/concurrent/locks/ReentrantLock;

    .line 79
    .line 80
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 81
    .line 82
    .line 83
    :try_start_0
    iget-boolean v10, v7, LA6/t;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    const/4 v11, 0x0

    .line 86
    if-nez v10, :cond_5

    .line 87
    .line 88
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 89
    .line 90
    .line 91
    move-object v13, v11

    .line 92
    goto :goto_6

    .line 93
    :cond_5
    const/4 v10, 0x0

    .line 94
    :try_start_1
    iput-boolean v10, v7, LA6/t;->a:Z

    .line 95
    .line 96
    array-length v12, v8

    .line 97
    new-array v13, v12, [LG0/r;

    .line 98
    .line 99
    move v14, v10

    .line 100
    move v15, v14

    .line 101
    :goto_1
    if-ge v14, v12, :cond_9

    .line 102
    .line 103
    aget-wide v16, v8, v14

    .line 104
    .line 105
    const-wide/16 v18, 0x0

    .line 106
    .line 107
    cmp-long v16, v16, v18

    .line 108
    .line 109
    if-lez v16, :cond_6

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_6
    move v4, v10

    .line 113
    :goto_2
    iget-object v10, v7, LA6/t;->d:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v10, [Z

    .line 116
    .line 117
    aget-boolean v5, v10, v14

    .line 118
    .line 119
    if-eq v4, v5, :cond_8

    .line 120
    .line 121
    aput-boolean v4, v10, v14

    .line 122
    .line 123
    if-eqz v4, :cond_7

    .line 124
    .line 125
    sget-object v4, LG0/r;->b:LG0/r;

    .line 126
    .line 127
    :goto_3
    const/4 v15, 0x1

    .line 128
    goto :goto_4

    .line 129
    :catchall_0
    move-exception v0

    .line 130
    goto :goto_9

    .line 131
    :cond_7
    sget-object v4, LG0/r;->c:LG0/r;

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_8
    sget-object v4, LG0/r;->a:LG0/r;

    .line 135
    .line 136
    :goto_4
    aput-object v4, v13, v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 137
    .line 138
    add-int/lit8 v14, v14, 0x1

    .line 139
    .line 140
    const/4 v4, 0x1

    .line 141
    const/4 v5, 0x2

    .line 142
    const/4 v10, 0x0

    .line 143
    goto :goto_1

    .line 144
    :cond_9
    if-eqz v15, :cond_a

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_a
    move-object v13, v11

    .line 148
    :goto_5
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 149
    .line 150
    .line 151
    :goto_6
    if-eqz v13, :cond_b

    .line 152
    .line 153
    new-instance v4, LG0/V;

    .line 154
    .line 155
    invoke-direct {v4, v13, v6, v2, v11}, LG0/V;-><init>([LG0/r;LG0/X;LG0/K;LE7/d;)V

    .line 156
    .line 157
    .line 158
    iput-object v11, v1, LG0/W;->s:Ljava/lang/Object;

    .line 159
    .line 160
    const/4 v5, 0x2

    .line 161
    iput v5, v1, LG0/W;->r:I

    .line 162
    .line 163
    invoke-interface {v2, v4, v1}, LG0/K;->a(LO7/p;LG7/j;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    if-ne v2, v0, :cond_b

    .line 168
    .line 169
    :goto_7
    return-object v0

    .line 170
    :cond_b
    :goto_8
    return-object v3

    .line 171
    :goto_9
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 172
    .line 173
    .line 174
    throw v0
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

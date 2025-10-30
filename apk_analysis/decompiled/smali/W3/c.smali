.class public final LW3/c;
.super LN3/a;
.source "SourceFile"

# interfaces
.implements Lk4/H;


# instance fields
.field public final h:Z

.field public final i:Landroid/net/Uri;

.field public final j:Lj3/Y;

.field public final k:Lk4/l;

.field public final l:Ls4/i;

.field public final m:LF5/e;

.field public final n:Ln3/o;

.field public final o:Le1/q;

.field public final p:J

.field public final q:LN3/G;

.field public final r:Lk4/O;

.field public final s:Ljava/util/ArrayList;

.field public t:Lk4/m;

.field public u:Lk4/M;

.field public v:Lk4/N;

.field public w:Lk4/W;

.field public x:J

.field public y:LX3/c;

.field public z:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "goog.exo.smoothstreaming"

    .line 2
    .line 3
    invoke-static {v0}, Lj3/K;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
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
.end method

.method public constructor <init>(Lj3/Y;Lk4/l;Lk4/O;Ls4/i;LF5/e;Ln3/o;Le1/q;J)V
    .locals 3

    .line 1
    invoke-direct {p0}, LN3/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LW3/c;->j:Lj3/Y;

    .line 5
    .line 6
    iget-object p1, p1, Lj3/Y;->b:Lj3/U;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, LW3/c;->y:LX3/c;

    .line 13
    .line 14
    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 15
    .line 16
    iget-object p1, p1, Lj3/U;->a:Landroid/net/Uri;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    move-object p1, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget v1, Ll4/y;->a:I

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    sget-object v2, Ll4/y;->i:Ljava/util/regex/Pattern;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    const-string v1, "Manifest"

    .line 55
    .line 56
    invoke-static {p1, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :cond_2
    :goto_0
    iput-object p1, p0, LW3/c;->i:Landroid/net/Uri;

    .line 61
    .line 62
    iput-object p2, p0, LW3/c;->k:Lk4/l;

    .line 63
    .line 64
    iput-object p3, p0, LW3/c;->r:Lk4/O;

    .line 65
    .line 66
    iput-object p4, p0, LW3/c;->l:Ls4/i;

    .line 67
    .line 68
    iput-object p5, p0, LW3/c;->m:LF5/e;

    .line 69
    .line 70
    iput-object p6, p0, LW3/c;->n:Ln3/o;

    .line 71
    .line 72
    iput-object p7, p0, LW3/c;->o:Le1/q;

    .line 73
    .line 74
    iput-wide p8, p0, LW3/c;->p:J

    .line 75
    .line 76
    invoke-virtual {p0, v0}, LN3/a;->a(LN3/A;)LN3/G;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, LW3/c;->q:LN3/G;

    .line 81
    .line 82
    const/4 p1, 0x0

    .line 83
    iput-boolean p1, p0, LW3/c;->h:Z

    .line 84
    .line 85
    new-instance p1, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object p1, p0, LW3/c;->s:Ljava/util/ArrayList;

    .line 91
    .line 92
    return-void
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
.end method


# virtual methods
.method public final b(LN3/A;Lk4/q;J)LN3/x;
    .locals 11

    .line 1
    invoke-virtual {p0, p1}, LN3/a;->a(LN3/A;)LN3/G;

    .line 2
    .line 3
    .line 4
    move-result-object v8

    .line 5
    new-instance v6, Ln3/l;

    .line 6
    .line 7
    iget-object p3, p0, LN3/a;->d:Ln3/l;

    .line 8
    .line 9
    iget-object p3, p3, Ln3/l;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    invoke-direct {v6, p3, p4, p1}, Ln3/l;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILN3/A;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, LW3/b;

    .line 16
    .line 17
    iget-object v1, p0, LW3/c;->y:LX3/c;

    .line 18
    .line 19
    iget-object v3, p0, LW3/c;->w:Lk4/W;

    .line 20
    .line 21
    iget-object v9, p0, LW3/c;->v:Lk4/N;

    .line 22
    .line 23
    iget-object v4, p0, LW3/c;->m:LF5/e;

    .line 24
    .line 25
    iget-object v5, p0, LW3/c;->n:Ln3/o;

    .line 26
    .line 27
    iget-object v2, p0, LW3/c;->l:Ls4/i;

    .line 28
    .line 29
    iget-object v7, p0, LW3/c;->o:Le1/q;

    .line 30
    .line 31
    move-object v10, p2

    .line 32
    invoke-direct/range {v0 .. v10}, LW3/b;-><init>(LX3/c;Ls4/i;Lk4/W;LF5/e;Ln3/o;Ln3/l;Le1/q;LN3/G;Lk4/N;Lk4/q;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, LW3/c;->s:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-object v0
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
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
.end method

.method public final e(Lk4/J;Ljava/io/IOException;I)LB3/f;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    check-cast p1, Lk4/P;

    .line 3
    .line 4
    new-instance v1, LN3/q;

    .line 5
    .line 6
    iget-wide v2, p1, Lk4/P;->a:J

    .line 7
    .line 8
    iget-object v2, p1, Lk4/P;->d:Lk4/V;

    .line 9
    .line 10
    iget-object v2, v2, Lk4/V;->c:Landroid/net/Uri;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, LW3/c;->o:Le1/q;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    instance-of v2, p2, Lj3/j0;

    .line 21
    .line 22
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    instance-of v2, p2, Ljava/io/FileNotFoundException;

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    instance-of v2, p2, Lk4/A;

    .line 34
    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    instance-of v2, p2, Lk4/L;

    .line 38
    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    sget v2, Lk4/n;->b:I

    .line 42
    .line 43
    move-object v2, p2

    .line 44
    :goto_0
    if-eqz v2, :cond_1

    .line 45
    .line 46
    instance-of v5, v2, Lk4/n;

    .line 47
    .line 48
    if-eqz v5, :cond_0

    .line 49
    .line 50
    move-object v5, v2

    .line 51
    check-cast v5, Lk4/n;

    .line 52
    .line 53
    iget v5, v5, Lk4/n;->a:I

    .line 54
    .line 55
    const/16 v6, 0x7d8

    .line 56
    .line 57
    if-ne v5, v6, :cond_0

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    add-int/lit8 p3, p3, -0x1

    .line 66
    .line 67
    mul-int/lit16 p3, p3, 0x3e8

    .line 68
    .line 69
    const/16 v2, 0x1388

    .line 70
    .line 71
    invoke-static {p3, v2}, Ljava/lang/Math;->min(II)I

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    int-to-long v5, p3

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    :goto_1
    move-wide v5, v3

    .line 78
    :goto_2
    cmp-long p3, v5, v3

    .line 79
    .line 80
    if-nez p3, :cond_3

    .line 81
    .line 82
    sget-object p3, Lk4/M;->f:LB3/f;

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    new-instance p3, LB3/f;

    .line 86
    .line 87
    invoke-direct {p3, v0, v5, v6, v0}, LB3/f;-><init>(IJZ)V

    .line 88
    .line 89
    .line 90
    :goto_3
    invoke-virtual {p3}, LB3/f;->a()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    xor-int/lit8 v0, v0, 0x1

    .line 95
    .line 96
    iget-object v2, p0, LW3/c;->q:LN3/G;

    .line 97
    .line 98
    iget p1, p1, Lk4/P;->c:I

    .line 99
    .line 100
    invoke-virtual {v2, v1, p1, p2, v0}, LN3/G;->j(LN3/q;ILjava/io/IOException;Z)V

    .line 101
    .line 102
    .line 103
    return-object p3
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
.end method

.method public final f(Lk4/J;JJ)V
    .locals 3

    .line 1
    check-cast p1, Lk4/P;

    .line 2
    .line 3
    new-instance v0, LN3/q;

    .line 4
    .line 5
    iget-wide v1, p1, Lk4/P;->a:J

    .line 6
    .line 7
    iget-object v1, p1, Lk4/P;->d:Lk4/V;

    .line 8
    .line 9
    iget-object v1, v1, Lk4/V;->c:Landroid/net/Uri;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LW3/c;->o:Le1/q;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, LW3/c;->q:LN3/G;

    .line 20
    .line 21
    iget v2, p1, Lk4/P;->c:I

    .line 22
    .line 23
    invoke-virtual {v1, v0, v2}, LN3/G;->f(LN3/q;I)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p1, Lk4/P;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, LX3/c;

    .line 29
    .line 30
    iput-object p1, p0, LW3/c;->y:LX3/c;

    .line 31
    .line 32
    sub-long/2addr p2, p4

    .line 33
    iput-wide p2, p0, LW3/c;->x:J

    .line 34
    .line 35
    invoke-virtual {p0}, LW3/c;->v()V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, LW3/c;->y:LX3/c;

    .line 39
    .line 40
    iget-boolean p1, p1, LX3/c;->d:Z

    .line 41
    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget-wide p1, p0, LW3/c;->x:J

    .line 46
    .line 47
    const-wide/16 p3, 0x1388

    .line 48
    .line 49
    add-long/2addr p1, p3

    .line 50
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 51
    .line 52
    .line 53
    move-result-wide p3

    .line 54
    sub-long/2addr p1, p3

    .line 55
    const-wide/16 p3, 0x0

    .line 56
    .line 57
    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    iget-object p3, p0, LW3/c;->z:Landroid/os/Handler;

    .line 62
    .line 63
    new-instance p4, LA6/s;

    .line 64
    .line 65
    const/16 p5, 0xc

    .line 66
    .line 67
    invoke-direct {p4, p5, p0}, LA6/s;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3, p4, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 71
    .line 72
    .line 73
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
.end method

.method public final j()Lj3/Y;
    .locals 1

    .line 1
    iget-object v0, p0, LW3/c;->j:Lj3/Y;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
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
.end method

.method public final l()V
    .locals 1

    .line 1
    iget-object v0, p0, LW3/c;->v:Lk4/N;

    .line 2
    .line 3
    invoke-interface {v0}, Lk4/N;->b()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
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
.end method

.method public final n(Lk4/W;)V
    .locals 2

    .line 1
    iput-object p1, p0, LW3/c;->w:Lk4/W;

    .line 2
    .line 3
    iget-object p1, p0, LW3/c;->n:Ln3/o;

    .line 4
    .line 5
    invoke-interface {p1}, Ln3/o;->b()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, LN3/a;->g:Lk3/l;

    .line 13
    .line 14
    invoke-static {v1}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0, v1}, Ln3/o;->l(Landroid/os/Looper;Lk3/l;)V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, p0, LW3/c;->h:Z

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    new-instance p1, Ld0/o;

    .line 25
    .line 26
    const/4 v0, 0x7

    .line 27
    invoke-direct {p1, v0}, Ld0/o;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, LW3/c;->v:Lk4/N;

    .line 31
    .line 32
    invoke-virtual {p0}, LW3/c;->v()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object p1, p0, LW3/c;->k:Lk4/l;

    .line 37
    .line 38
    invoke-interface {p1}, Lk4/l;->c()Lk4/m;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, LW3/c;->t:Lk4/m;

    .line 43
    .line 44
    new-instance p1, Lk4/M;

    .line 45
    .line 46
    const-string v0, "SsMediaSource"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Lk4/M;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, LW3/c;->u:Lk4/M;

    .line 52
    .line 53
    iput-object p1, p0, LW3/c;->v:Lk4/N;

    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    invoke-static {p1}, Ll4/y;->l(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, LW3/c;->z:Landroid/os/Handler;

    .line 61
    .line 62
    invoke-virtual {p0}, LW3/c;->w()V

    .line 63
    .line 64
    .line 65
    return-void
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final p(LN3/x;)V
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, LW3/b;

    .line 3
    .line 4
    iget-object v1, v0, LW3/b;->m:[LP3/g;

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    const/4 v4, 0x0

    .line 9
    if-ge v3, v2, :cond_0

    .line 10
    .line 11
    aget-object v5, v1, v3

    .line 12
    .line 13
    invoke-virtual {v5, v4}, LP3/g;->A(LQ3/b;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iput-object v4, v0, LW3/b;->k:LN3/w;

    .line 20
    .line 21
    iget-object v0, p0, LW3/c;->s:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void
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
.end method

.method public final r()V
    .locals 4

    .line 1
    iget-boolean v0, p0, LW3/c;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, LW3/c;->y:LX3/c;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    iput-object v0, p0, LW3/c;->y:LX3/c;

    .line 11
    .line 12
    iput-object v1, p0, LW3/c;->t:Lk4/m;

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    iput-wide v2, p0, LW3/c;->x:J

    .line 17
    .line 18
    iget-object v0, p0, LW3/c;->u:Lk4/M;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lk4/M;->e(Lk4/K;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, LW3/c;->u:Lk4/M;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, LW3/c;->z:Landroid/os/Handler;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, LW3/c;->z:Landroid/os/Handler;

    .line 35
    .line 36
    :cond_2
    iget-object v0, p0, LW3/c;->n:Ln3/o;

    .line 37
    .line 38
    invoke-interface {v0}, Ln3/o;->a()V

    .line 39
    .line 40
    .line 41
    return-void
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
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
.end method

.method public final s(Lk4/J;JJZ)V
    .locals 11

    .line 1
    check-cast p1, Lk4/P;

    .line 2
    .line 3
    new-instance v1, LN3/q;

    .line 4
    .line 5
    iget-wide p2, p1, Lk4/P;->a:J

    .line 6
    .line 7
    iget-object p2, p1, Lk4/P;->d:Lk4/V;

    .line 8
    .line 9
    iget-object p2, p2, Lk4/V;->c:Landroid/net/Uri;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, LW3/c;->o:Le1/q;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iget-object v0, p0, LW3/c;->q:LN3/G;

    .line 30
    .line 31
    iget v2, p1, Lk4/P;->c:I

    .line 32
    .line 33
    const/4 v3, -0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-virtual/range {v0 .. v10}, LN3/G;->d(LN3/q;IILj3/M;ILjava/lang/Object;JJ)V

    .line 38
    .line 39
    .line 40
    return-void
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
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
.end method

.method public final v()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    iget-object v3, v0, LW3/c;->s:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    const/4 v5, 0x1

    .line 11
    if-ge v2, v4, :cond_4

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, LW3/b;

    .line 18
    .line 19
    iget-object v4, v0, LW3/c;->y:LX3/c;

    .line 20
    .line 21
    iput-object v4, v3, LW3/b;->l:LX3/c;

    .line 22
    .line 23
    iget-object v6, v3, LW3/b;->m:[LP3/g;

    .line 24
    .line 25
    array-length v7, v6

    .line 26
    const/4 v8, 0x0

    .line 27
    :goto_1
    if-ge v8, v7, :cond_3

    .line 28
    .line 29
    aget-object v9, v6, v8

    .line 30
    .line 31
    iget-object v9, v9, LP3/g;->e:LP3/h;

    .line 32
    .line 33
    check-cast v9, LW3/a;

    .line 34
    .line 35
    iget-object v10, v9, LW3/a;->f:LX3/c;

    .line 36
    .line 37
    iget-object v10, v10, LX3/c;->f:[LX3/b;

    .line 38
    .line 39
    iget v11, v9, LW3/a;->b:I

    .line 40
    .line 41
    aget-object v10, v10, v11

    .line 42
    .line 43
    iget v12, v10, LX3/b;->k:I

    .line 44
    .line 45
    iget-object v13, v4, LX3/c;->f:[LX3/b;

    .line 46
    .line 47
    aget-object v11, v13, v11

    .line 48
    .line 49
    if-eqz v12, :cond_0

    .line 50
    .line 51
    iget v13, v11, LX3/b;->k:I

    .line 52
    .line 53
    if-nez v13, :cond_1

    .line 54
    .line 55
    :cond_0
    move v13, v2

    .line 56
    const/4 v11, 0x0

    .line 57
    goto :goto_2

    .line 58
    :cond_1
    add-int/lit8 v13, v12, -0x1

    .line 59
    .line 60
    iget-object v14, v10, LX3/b;->o:[J

    .line 61
    .line 62
    aget-wide v15, v14, v13

    .line 63
    .line 64
    invoke-virtual {v10, v13}, LX3/b;->b(I)J

    .line 65
    .line 66
    .line 67
    move-result-wide v17

    .line 68
    add-long v17, v17, v15

    .line 69
    .line 70
    iget-object v10, v11, LX3/b;->o:[J

    .line 71
    .line 72
    move v13, v2

    .line 73
    const/4 v11, 0x0

    .line 74
    aget-wide v1, v10, v11

    .line 75
    .line 76
    cmp-long v10, v17, v1

    .line 77
    .line 78
    if-gtz v10, :cond_2

    .line 79
    .line 80
    iget v1, v9, LW3/a;->g:I

    .line 81
    .line 82
    add-int/2addr v1, v12

    .line 83
    iput v1, v9, LW3/a;->g:I

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_2
    iget v10, v9, LW3/a;->g:I

    .line 87
    .line 88
    invoke-static {v14, v1, v2, v5}, Ll4/y;->e([JJZ)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    add-int/2addr v1, v10

    .line 93
    iput v1, v9, LW3/a;->g:I

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :goto_2
    iget v1, v9, LW3/a;->g:I

    .line 97
    .line 98
    add-int/2addr v1, v12

    .line 99
    iput v1, v9, LW3/a;->g:I

    .line 100
    .line 101
    :goto_3
    iput-object v4, v9, LW3/a;->f:LX3/c;

    .line 102
    .line 103
    add-int/lit8 v8, v8, 0x1

    .line 104
    .line 105
    move v2, v13

    .line 106
    goto :goto_1

    .line 107
    :cond_3
    move v13, v2

    .line 108
    const/4 v11, 0x0

    .line 109
    iget-object v1, v3, LW3/b;->k:LN3/w;

    .line 110
    .line 111
    invoke-interface {v1, v3}, LN3/e0;->v(LN3/f0;)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v2, v13, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_4
    const/4 v11, 0x0

    .line 118
    iget-object v1, v0, LW3/c;->y:LX3/c;

    .line 119
    .line 120
    iget-object v1, v1, LX3/c;->f:[LX3/b;

    .line 121
    .line 122
    array-length v2, v1

    .line 123
    const-wide v3, 0x7fffffffffffffffL

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    const-wide/high16 v6, -0x8000000000000000L

    .line 129
    .line 130
    move-wide v9, v3

    .line 131
    move v8, v11

    .line 132
    :goto_4
    if-ge v8, v2, :cond_6

    .line 133
    .line 134
    aget-object v12, v1, v8

    .line 135
    .line 136
    iget v13, v12, LX3/b;->k:I

    .line 137
    .line 138
    if-lez v13, :cond_5

    .line 139
    .line 140
    iget-object v13, v12, LX3/b;->o:[J

    .line 141
    .line 142
    aget-wide v14, v13, v11

    .line 143
    .line 144
    invoke-static {v9, v10, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 145
    .line 146
    .line 147
    move-result-wide v9

    .line 148
    iget v14, v12, LX3/b;->k:I

    .line 149
    .line 150
    sub-int/2addr v14, v5

    .line 151
    aget-wide v15, v13, v14

    .line 152
    .line 153
    invoke-virtual {v12, v14}, LX3/b;->b(I)J

    .line 154
    .line 155
    .line 156
    move-result-wide v12

    .line 157
    add-long/2addr v12, v15

    .line 158
    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 159
    .line 160
    .line 161
    move-result-wide v6

    .line 162
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_6
    cmp-long v1, v9, v3

    .line 166
    .line 167
    const-wide/16 v2, 0x0

    .line 168
    .line 169
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    if-nez v1, :cond_8

    .line 175
    .line 176
    iget-object v1, v0, LW3/c;->y:LX3/c;

    .line 177
    .line 178
    iget-boolean v1, v1, LX3/c;->d:Z

    .line 179
    .line 180
    if-eqz v1, :cond_7

    .line 181
    .line 182
    move-wide v7, v4

    .line 183
    goto :goto_5

    .line 184
    :cond_7
    move-wide v7, v2

    .line 185
    :goto_5
    new-instance v6, LN3/h0;

    .line 186
    .line 187
    iget-object v1, v0, LW3/c;->y:LX3/c;

    .line 188
    .line 189
    iget-boolean v2, v1, LX3/c;->d:Z

    .line 190
    .line 191
    const-wide/16 v13, 0x0

    .line 192
    .line 193
    const/4 v15, 0x1

    .line 194
    const-wide/16 v9, 0x0

    .line 195
    .line 196
    const-wide/16 v11, 0x0

    .line 197
    .line 198
    iget-object v3, v0, LW3/c;->j:Lj3/Y;

    .line 199
    .line 200
    move/from16 v17, v2

    .line 201
    .line 202
    move-object/from16 v18, v1

    .line 203
    .line 204
    move/from16 v16, v2

    .line 205
    .line 206
    move-object/from16 v19, v3

    .line 207
    .line 208
    invoke-direct/range {v6 .. v19}, LN3/h0;-><init>(JJJJZZZLjava/lang/Object;Lj3/Y;)V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_8

    .line 212
    .line 213
    :cond_8
    iget-object v1, v0, LW3/c;->y:LX3/c;

    .line 214
    .line 215
    iget-boolean v8, v1, LX3/c;->d:Z

    .line 216
    .line 217
    if-eqz v8, :cond_b

    .line 218
    .line 219
    iget-wide v11, v1, LX3/c;->h:J

    .line 220
    .line 221
    cmp-long v1, v11, v4

    .line 222
    .line 223
    if-eqz v1, :cond_9

    .line 224
    .line 225
    cmp-long v1, v11, v2

    .line 226
    .line 227
    if-lez v1, :cond_9

    .line 228
    .line 229
    sub-long v1, v6, v11

    .line 230
    .line 231
    invoke-static {v9, v10, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 232
    .line 233
    .line 234
    move-result-wide v9

    .line 235
    :cond_9
    move-wide/from16 v16, v9

    .line 236
    .line 237
    sub-long v14, v6, v16

    .line 238
    .line 239
    iget-wide v1, v0, LW3/c;->p:J

    .line 240
    .line 241
    invoke-static {v1, v2}, Ll4/y;->H(J)J

    .line 242
    .line 243
    .line 244
    move-result-wide v1

    .line 245
    sub-long v1, v14, v1

    .line 246
    .line 247
    const-wide/32 v3, 0x4c4b40

    .line 248
    .line 249
    .line 250
    cmp-long v5, v1, v3

    .line 251
    .line 252
    if-gez v5, :cond_a

    .line 253
    .line 254
    const-wide/16 v1, 0x2

    .line 255
    .line 256
    div-long v1, v14, v1

    .line 257
    .line 258
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 259
    .line 260
    .line 261
    move-result-wide v1

    .line 262
    :cond_a
    move-wide/from16 v18, v1

    .line 263
    .line 264
    new-instance v11, LN3/h0;

    .line 265
    .line 266
    iget-object v1, v0, LW3/c;->y:LX3/c;

    .line 267
    .line 268
    const/16 v21, 0x1

    .line 269
    .line 270
    const/16 v22, 0x1

    .line 271
    .line 272
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    const/16 v20, 0x1

    .line 278
    .line 279
    iget-object v2, v0, LW3/c;->j:Lj3/Y;

    .line 280
    .line 281
    move-object/from16 v23, v1

    .line 282
    .line 283
    move-object/from16 v24, v2

    .line 284
    .line 285
    invoke-direct/range {v11 .. v24}, LN3/h0;-><init>(JJJJZZZLjava/lang/Object;Lj3/Y;)V

    .line 286
    .line 287
    .line 288
    move-object v6, v11

    .line 289
    goto :goto_8

    .line 290
    :cond_b
    iget-wide v1, v1, LX3/c;->g:J

    .line 291
    .line 292
    cmp-long v3, v1, v4

    .line 293
    .line 294
    if-eqz v3, :cond_c

    .line 295
    .line 296
    :goto_6
    move-wide/from16 v19, v1

    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_c
    sub-long v1, v6, v9

    .line 300
    .line 301
    goto :goto_6

    .line 302
    :goto_7
    new-instance v12, LN3/h0;

    .line 303
    .line 304
    add-long v17, v9, v19

    .line 305
    .line 306
    iget-object v1, v0, LW3/c;->y:LX3/c;

    .line 307
    .line 308
    iget-object v2, v0, LW3/c;->j:Lj3/Y;

    .line 309
    .line 310
    const/16 v30, 0x0

    .line 311
    .line 312
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    const-wide/16 v23, 0x0

    .line 323
    .line 324
    const/16 v25, 0x1

    .line 325
    .line 326
    const/16 v26, 0x0

    .line 327
    .line 328
    const/16 v27, 0x0

    .line 329
    .line 330
    move-object/from16 v28, v1

    .line 331
    .line 332
    move-object/from16 v29, v2

    .line 333
    .line 334
    move-wide/from16 v21, v9

    .line 335
    .line 336
    invoke-direct/range {v12 .. v30}, LN3/h0;-><init>(JJJJJJZZZLjava/lang/Object;Lj3/Y;Lj3/T;)V

    .line 337
    .line 338
    .line 339
    move-object v6, v12

    .line 340
    :goto_8
    invoke-virtual {v0, v6}, LN3/a;->o(Lj3/E0;)V

    .line 341
    .line 342
    .line 343
    return-void
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method public final w()V
    .locals 14

    .line 1
    iget-object v0, p0, LW3/c;->u:Lk4/M;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk4/M;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lk4/P;

    .line 11
    .line 12
    iget-object v1, p0, LW3/c;->t:Lk4/m;

    .line 13
    .line 14
    iget-object v2, p0, LW3/c;->r:Lk4/O;

    .line 15
    .line 16
    iget-object v3, p0, LW3/c;->i:Landroid/net/Uri;

    .line 17
    .line 18
    const/4 v4, 0x4

    .line 19
    invoke-direct {v0, v1, v3, v4, v2}, Lk4/P;-><init>(Lk4/m;Landroid/net/Uri;ILk4/O;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, LW3/c;->u:Lk4/M;

    .line 23
    .line 24
    iget-object v2, p0, LW3/c;->o:Le1/q;

    .line 25
    .line 26
    iget v5, v0, Lk4/P;->c:I

    .line 27
    .line 28
    invoke-virtual {v2, v5}, Le1/q;->f(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v1, v0, p0, v2}, Lk4/M;->f(Lk4/J;Lk4/H;I)J

    .line 33
    .line 34
    .line 35
    new-instance v4, LN3/q;

    .line 36
    .line 37
    iget-object v0, v0, Lk4/P;->b:Lk4/p;

    .line 38
    .line 39
    invoke-direct {v4, v0}, LN3/q;-><init>(Lk4/p;)V

    .line 40
    .line 41
    .line 42
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    iget-object v3, p0, LW3/c;->q:LN3/G;

    .line 53
    .line 54
    const/4 v6, -0x1

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v9, 0x0

    .line 58
    invoke-virtual/range {v3 .. v13}, LN3/G;->l(LN3/q;IILj3/M;ILjava/lang/Object;JJ)V

    .line 59
    .line 60
    .line 61
    return-void
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
.end method

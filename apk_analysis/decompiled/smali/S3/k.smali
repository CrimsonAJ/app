.class public final LS3/k;
.super LP3/k;
.source "SourceFile"


# static fields
.field public static final j0:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final A:Z

.field public final B:Z

.field public C:LS3/b;

.field public D:LS3/r;

.field public X:I

.field public Y:Z

.field public volatile Z:Z

.field public f0:Z

.field public g0:LP5/S;

.field public h0:Z

.field public i0:Z

.field public final k:I

.field public final l:I

.field public final m:Landroid/net/Uri;

.field public final n:Z

.field public final o:I

.field public final p:Lk4/m;

.field public final q:Lk4/p;

.field public final r:LS3/b;

.field public final s:Z

.field public final t:Z

.field public final u:Ll4/x;

.field public final v:LS3/c;

.field public final w:Ljava/util/List;

.field public final x:Ln3/g;

.field public final y:LI3/i;

.field public final z:LA4/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LS3/k;->j0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    return-void
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

.method public constructor <init>(LS3/c;Lk4/m;Lk4/p;Lj3/M;ZLk4/m;Lk4/p;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLl4/x;Ln3/g;LS3/b;LI3/i;LA4/r;ZLk3/l;)V
    .locals 13

    move-object/from16 v0, p7

    move-object v1, p0

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p11

    move-object/from16 v6, p12

    move-wide/from16 v7, p13

    move-wide/from16 v9, p15

    move-wide/from16 v11, p17

    .line 1
    invoke-direct/range {v1 .. v12}, LP3/k;-><init>(Lk4/m;Lk4/p;Lj3/M;ILjava/lang/Object;JJJ)V

    move/from16 p2, p5

    .line 2
    iput-boolean p2, p0, LS3/k;->A:Z

    move/from16 p2, p19

    .line 3
    iput p2, p0, LS3/k;->o:I

    move/from16 p2, p20

    .line 4
    iput-boolean p2, p0, LS3/k;->i0:Z

    move/from16 p2, p21

    .line 5
    iput p2, p0, LS3/k;->l:I

    .line 6
    iput-object v0, p0, LS3/k;->q:Lk4/p;

    move-object/from16 p2, p6

    .line 7
    iput-object p2, p0, LS3/k;->p:Lk4/m;

    if-eqz v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 8
    :goto_0
    iput-boolean p2, p0, LS3/k;->Y:Z

    move/from16 p2, p8

    .line 9
    iput-boolean p2, p0, LS3/k;->B:Z

    move-object/from16 p2, p9

    .line 10
    iput-object p2, p0, LS3/k;->m:Landroid/net/Uri;

    move/from16 p2, p23

    .line 11
    iput-boolean p2, p0, LS3/k;->s:Z

    move-object/from16 p2, p24

    .line 12
    iput-object p2, p0, LS3/k;->u:Ll4/x;

    move/from16 p2, p22

    .line 13
    iput-boolean p2, p0, LS3/k;->t:Z

    .line 14
    iput-object p1, p0, LS3/k;->v:LS3/c;

    move-object/from16 p1, p10

    .line 15
    iput-object p1, p0, LS3/k;->w:Ljava/util/List;

    move-object/from16 p1, p25

    .line 16
    iput-object p1, p0, LS3/k;->x:Ln3/g;

    move-object/from16 p1, p26

    .line 17
    iput-object p1, p0, LS3/k;->r:LS3/b;

    move-object/from16 p1, p27

    .line 18
    iput-object p1, p0, LS3/k;->y:LI3/i;

    move-object/from16 p1, p28

    .line 19
    iput-object p1, p0, LS3/k;->z:LA4/r;

    move/from16 p1, p29

    .line 20
    iput-boolean p1, p0, LS3/k;->n:Z

    .line 21
    sget-object p1, LP5/F;->b:LP5/D;

    .line 22
    sget-object p1, LP5/S;->e:LP5/S;

    .line 23
    iput-object p1, p0, LS3/k;->g0:LP5/S;

    .line 24
    sget-object p1, LS3/k;->j0:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    iput p1, p0, LS3/k;->k:I

    return-void
.end method

.method public static f(Ljava/lang/String;)[B
    .locals 4

    .line 1
    invoke-static {p0}, LB6/u0;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "0x"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    .line 19
    .line 20
    const/16 v1, 0x10

    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-array v0, v1, [B

    .line 30
    .line 31
    array-length v2, p0

    .line 32
    if-le v2, v1, :cond_1

    .line 33
    .line 34
    array-length v2, p0

    .line 35
    sub-int/2addr v2, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v2, 0x0

    .line 38
    :goto_0
    array-length v3, p0

    .line 39
    sub-int/2addr v1, v3

    .line 40
    add-int/2addr v1, v2

    .line 41
    array-length v3, p0

    .line 42
    sub-int/2addr v3, v2

    .line 43
    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    return-object v0
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
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, LS3/k;->D:LS3/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LS3/k;->C:LS3/b;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, LS3/k;->r:LS3/b;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v2, v0, LS3/b;->a:Lq3/j;

    .line 16
    .line 17
    instance-of v3, v2, LA3/G;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    instance-of v2, v2, Ly3/i;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    :cond_0
    iput-object v0, p0, LS3/k;->C:LS3/b;

    .line 26
    .line 27
    iput-boolean v1, p0, LS3/k;->Y:Z

    .line 28
    .line 29
    :cond_1
    iget-boolean v0, p0, LS3/k;->Y:Z

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    iget-object v0, p0, LS3/k;->p:Lk4/m;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, LS3/k;->q:Lk4/p;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-boolean v3, p0, LS3/k;->B:Z

    .line 45
    .line 46
    invoke-virtual {p0, v0, v2, v3, v1}, LS3/k;->e(Lk4/m;Lk4/p;ZZ)V

    .line 47
    .line 48
    .line 49
    iput v1, p0, LS3/k;->X:I

    .line 50
    .line 51
    iput-boolean v1, p0, LS3/k;->Y:Z

    .line 52
    .line 53
    :goto_0
    iget-boolean v0, p0, LS3/k;->Z:Z

    .line 54
    .line 55
    if-nez v0, :cond_4

    .line 56
    .line 57
    iget-boolean v0, p0, LS3/k;->t:Z

    .line 58
    .line 59
    const/4 v1, 0x1

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    iget-boolean v0, p0, LS3/k;->A:Z

    .line 63
    .line 64
    iget-object v2, p0, LP3/e;->i:Lk4/V;

    .line 65
    .line 66
    iget-object v3, p0, LP3/e;->b:Lk4/p;

    .line 67
    .line 68
    invoke-virtual {p0, v2, v3, v0, v1}, LS3/k;->e(Lk4/m;Lk4/p;ZZ)V

    .line 69
    .line 70
    .line 71
    :cond_3
    iget-boolean v0, p0, LS3/k;->Z:Z

    .line 72
    .line 73
    xor-int/2addr v0, v1

    .line 74
    iput-boolean v0, p0, LS3/k;->f0:Z

    .line 75
    .line 76
    :cond_4
    return-void
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

.method public final c()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LS3/k;->Z:Z

    .line 3
    .line 4
    return-void
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

.method public final d()Z
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final e(Lk4/m;Lk4/p;ZZ)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_1

    .line 3
    .line 4
    iget p3, p0, LS3/k;->X:I

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    :cond_0
    move-object p3, p2

    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget p3, p0, LS3/k;->X:I

    .line 12
    .line 13
    int-to-long v1, p3

    .line 14
    invoke-virtual {p2, v1, v2}, Lk4/p;->c(J)Lk4/p;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    :goto_0
    :try_start_0
    invoke-virtual {p0, p1, p3, p4}, LS3/k;->h(Lk4/m;Lk4/p;Z)Lq3/g;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget p4, p0, LS3/k;->X:I

    .line 25
    .line 26
    invoke-virtual {p3, p4}, Lq3/g;->n(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p2

    .line 31
    goto :goto_6

    .line 32
    :cond_2
    :goto_1
    :try_start_1
    iget-boolean p4, p0, LS3/k;->Z:Z

    .line 33
    .line 34
    if-nez p4, :cond_3

    .line 35
    .line 36
    iget-object p4, p0, LS3/k;->C:LS3/b;

    .line 37
    .line 38
    sget-object v0, LS3/b;->d:Lc7/j;

    .line 39
    .line 40
    iget-object p4, p4, LS3/b;->a:Lq3/j;

    .line 41
    .line 42
    invoke-interface {p4, p3, v0}, Lq3/j;->f(Lq3/k;Lc7/j;)I

    .line 43
    .line 44
    .line 45
    move-result p4
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    if-nez p4, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_1
    move-exception p4

    .line 50
    goto :goto_5

    .line 51
    :catch_0
    move-exception p4

    .line 52
    goto :goto_3

    .line 53
    :cond_3
    :try_start_2
    iget-wide p3, p3, Lq3/g;->d:J

    .line 54
    .line 55
    iget-wide v0, p2, Lk4/p;->e:J

    .line 56
    .line 57
    :goto_2
    sub-long/2addr p3, v0

    .line 58
    long-to-int p2, p3

    .line 59
    iput p2, p0, LS3/k;->X:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :goto_3
    :try_start_3
    iget-object v0, p0, LP3/e;->d:Lj3/M;

    .line 63
    .line 64
    iget v0, v0, Lj3/M;->e:I

    .line 65
    .line 66
    and-int/lit16 v0, v0, 0x4000

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    iget-object p4, p0, LS3/k;->C:LS3/b;

    .line 71
    .line 72
    iget-object p4, p4, LS3/b;->a:Lq3/j;

    .line 73
    .line 74
    const-wide/16 v0, 0x0

    .line 75
    .line 76
    invoke-interface {p4, v0, v1, v0, v1}, Lq3/j;->b(JJ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 77
    .line 78
    .line 79
    :try_start_4
    iget-wide p3, p3, Lq3/g;->d:J

    .line 80
    .line 81
    iget-wide v0, p2, Lk4/p;->e:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :goto_4
    invoke-static {p1}, Ls8/n;->h(Lk4/m;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    :try_start_5
    throw p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 89
    :goto_5
    :try_start_6
    iget-wide v0, p3, Lq3/g;->d:J

    .line 90
    .line 91
    iget-wide p2, p2, Lk4/p;->e:J

    .line 92
    .line 93
    sub-long/2addr v0, p2

    .line 94
    long-to-int p2, v0

    .line 95
    iput p2, p0, LS3/k;->X:I

    .line 96
    .line 97
    throw p4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 98
    :goto_6
    invoke-static {p1}, Ls8/n;->h(Lk4/m;)V

    .line 99
    .line 100
    .line 101
    throw p2
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

.method public final g(I)I
    .locals 2

    .line 1
    iget-boolean v0, p0, LS3/k;->n:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Ll4/a;->m(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LS3/k;->g0:LP5/S;

    .line 9
    .line 10
    iget v1, v0, LP5/S;->d:I

    .line 11
    .line 12
    if-lt p1, v1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {v0, p1}, LP5/S;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
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

.method public final h(Lk4/m;Lk4/p;Z)Lq3/g;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    invoke-interface/range {p1 .. p2}, Lk4/m;->g(Lk4/p;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v6

    .line 9
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v10, 0x0

    .line 15
    const/4 v11, 0x1

    .line 16
    if-eqz p3, :cond_4

    .line 17
    .line 18
    :try_start_0
    iget-object v2, v1, LS3/k;->u:Ll4/x;

    .line 19
    .line 20
    iget-boolean v3, v1, LS3/k;->s:Z

    .line 21
    .line 22
    iget-wide v4, v1, LP3/e;->g:J

    .line 23
    .line 24
    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    :try_start_1
    iget-wide v12, v2, Ll4/x;->a:J

    .line 26
    .line 27
    const-wide v14, 0x7ffffffffffffffeL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v12, v12, v14

    .line 33
    .line 34
    if-nez v12, :cond_0

    .line 35
    .line 36
    move v12, v11

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v12, v10

    .line 39
    :goto_0
    invoke-static {v12}, Ll4/a;->m(Z)V

    .line 40
    .line 41
    .line 42
    iget-wide v12, v2, Ll4/x;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    cmp-long v12, v12, v8

    .line 45
    .line 46
    if-eqz v12, :cond_1

    .line 47
    .line 48
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 49
    goto :goto_4

    .line 50
    :cond_1
    if-eqz v3, :cond_2

    .line 51
    .line 52
    :try_start_3
    iget-object v3, v2, Ll4/x;->d:Ljava/lang/ThreadLocal;

    .line 53
    .line 54
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto :goto_3

    .line 64
    :cond_2
    :goto_1
    iget-wide v3, v2, Ll4/x;->b:J

    .line 65
    .line 66
    cmp-long v3, v3, v8

    .line 67
    .line 68
    if-nez v3, :cond_3

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    :goto_2
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    .line 75
    goto :goto_4

    .line 76
    :goto_3
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 77
    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_0

    .line 78
    :catch_0
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_4
    :goto_4
    new-instance v2, Lq3/g;

    .line 85
    .line 86
    iget-wide v4, v0, Lk4/p;->e:J

    .line 87
    .line 88
    move-object/from16 v3, p1

    .line 89
    .line 90
    invoke-direct/range {v2 .. v7}, Lq3/g;-><init>(Lk4/j;JJ)V

    .line 91
    .line 92
    .line 93
    iget-object v3, v1, LS3/k;->C:LS3/b;

    .line 94
    .line 95
    if-nez v3, :cond_30

    .line 96
    .line 97
    iget-object v3, v1, LS3/k;->z:LA4/r;

    .line 98
    .line 99
    iput v10, v2, Lq3/g;->f:I

    .line 100
    .line 101
    const/16 v4, 0xa

    .line 102
    .line 103
    const/16 v5, 0x8

    .line 104
    .line 105
    :try_start_7
    invoke-virtual {v3, v4}, LA4/r;->E(I)V

    .line 106
    .line 107
    .line 108
    iget-object v6, v3, LA4/r;->c:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v6, [B

    .line 111
    .line 112
    invoke-virtual {v2, v6, v10, v4, v10}, Lq3/g;->t([BIIZ)Z
    :try_end_7
    .catch Ljava/io/EOFException; {:try_start_7 .. :try_end_7} :catch_1

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, LA4/r;->z()I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    const v7, 0x494433

    .line 120
    .line 121
    .line 122
    if-eq v6, v7, :cond_6

    .line 123
    .line 124
    :catch_1
    :cond_5
    :goto_5
    move-wide v3, v8

    .line 125
    goto :goto_7

    .line 126
    :cond_6
    const/4 v6, 0x3

    .line 127
    invoke-virtual {v3, v6}, LA4/r;->I(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3}, LA4/r;->w()I

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    add-int/lit8 v7, v6, 0xa

    .line 135
    .line 136
    iget-object v12, v3, LA4/r;->c:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v12, [B

    .line 139
    .line 140
    array-length v13, v12

    .line 141
    if-le v7, v13, :cond_7

    .line 142
    .line 143
    invoke-virtual {v3, v7}, LA4/r;->E(I)V

    .line 144
    .line 145
    .line 146
    iget-object v7, v3, LA4/r;->c:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v7, [B

    .line 149
    .line 150
    invoke-static {v12, v10, v7, v10, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 151
    .line 152
    .line 153
    :cond_7
    iget-object v7, v3, LA4/r;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v7, [B

    .line 156
    .line 157
    invoke-virtual {v2, v7, v4, v6, v10}, Lq3/g;->t([BIIZ)Z

    .line 158
    .line 159
    .line 160
    iget-object v4, v3, LA4/r;->c:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v4, [B

    .line 163
    .line 164
    iget-object v7, v1, LS3/k;->y:LI3/i;

    .line 165
    .line 166
    invoke-virtual {v7, v6, v4}, LI3/i;->a0(I[B)LD3/c;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    if-nez v4, :cond_8

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_8
    iget-object v4, v4, LD3/c;->a:[LD3/b;

    .line 174
    .line 175
    array-length v6, v4

    .line 176
    move v7, v10

    .line 177
    :goto_6
    if-ge v7, v6, :cond_5

    .line 178
    .line 179
    aget-object v12, v4, v7

    .line 180
    .line 181
    instance-of v13, v12, LI3/m;

    .line 182
    .line 183
    if-eqz v13, :cond_9

    .line 184
    .line 185
    check-cast v12, LI3/m;

    .line 186
    .line 187
    iget-object v13, v12, LI3/m;->b:Ljava/lang/String;

    .line 188
    .line 189
    const-string v14, "com.apple.streaming.transportStreamTimestamp"

    .line 190
    .line 191
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v13

    .line 195
    if-eqz v13, :cond_9

    .line 196
    .line 197
    iget-object v4, v3, LA4/r;->c:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v4, [B

    .line 200
    .line 201
    iget-object v6, v12, LI3/m;->c:[B

    .line 202
    .line 203
    invoke-static {v6, v10, v4, v10, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3, v10}, LA4/r;->H(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3, v5}, LA4/r;->G(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3}, LA4/r;->q()J

    .line 213
    .line 214
    .line 215
    move-result-wide v3

    .line 216
    const-wide v6, 0x1ffffffffL

    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    and-long/2addr v3, v6

    .line 222
    goto :goto_7

    .line 223
    :cond_9
    add-int/lit8 v7, v7, 0x1

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :goto_7
    iput v10, v2, Lq3/g;->f:I

    .line 227
    .line 228
    iget-object v6, v1, LS3/k;->r:LS3/b;

    .line 229
    .line 230
    if-eqz v6, :cond_11

    .line 231
    .line 232
    iget-object v0, v6, LS3/b;->a:Lq3/j;

    .line 233
    .line 234
    instance-of v5, v0, LA3/G;

    .line 235
    .line 236
    if-nez v5, :cond_b

    .line 237
    .line 238
    instance-of v0, v0, Ly3/i;

    .line 239
    .line 240
    if-eqz v0, :cond_a

    .line 241
    .line 242
    goto :goto_8

    .line 243
    :cond_a
    move v0, v10

    .line 244
    goto :goto_9

    .line 245
    :cond_b
    :goto_8
    move v0, v11

    .line 246
    :goto_9
    xor-int/2addr v0, v11

    .line 247
    invoke-static {v0}, Ll4/a;->m(Z)V

    .line 248
    .line 249
    .line 250
    iget-object v0, v6, LS3/b;->a:Lq3/j;

    .line 251
    .line 252
    instance-of v5, v0, LS3/v;

    .line 253
    .line 254
    iget-object v7, v6, LS3/b;->c:Ll4/x;

    .line 255
    .line 256
    iget-object v6, v6, LS3/b;->b:Lj3/M;

    .line 257
    .line 258
    if-eqz v5, :cond_c

    .line 259
    .line 260
    new-instance v0, LS3/v;

    .line 261
    .line 262
    iget-object v5, v6, Lj3/M;->c:Ljava/lang/String;

    .line 263
    .line 264
    invoke-direct {v0, v5, v7}, LS3/v;-><init>(Ljava/lang/String;Ll4/x;)V

    .line 265
    .line 266
    .line 267
    goto :goto_a

    .line 268
    :cond_c
    instance-of v5, v0, LA3/d;

    .line 269
    .line 270
    if-eqz v5, :cond_d

    .line 271
    .line 272
    new-instance v0, LA3/d;

    .line 273
    .line 274
    invoke-direct {v0}, LA3/d;-><init>()V

    .line 275
    .line 276
    .line 277
    goto :goto_a

    .line 278
    :cond_d
    instance-of v5, v0, LA3/a;

    .line 279
    .line 280
    if-eqz v5, :cond_e

    .line 281
    .line 282
    new-instance v0, LA3/a;

    .line 283
    .line 284
    invoke-direct {v0}, LA3/a;-><init>()V

    .line 285
    .line 286
    .line 287
    goto :goto_a

    .line 288
    :cond_e
    instance-of v5, v0, LA3/c;

    .line 289
    .line 290
    if-eqz v5, :cond_f

    .line 291
    .line 292
    new-instance v0, LA3/c;

    .line 293
    .line 294
    invoke-direct {v0}, LA3/c;-><init>()V

    .line 295
    .line 296
    .line 297
    goto :goto_a

    .line 298
    :cond_f
    instance-of v5, v0, Lx3/d;

    .line 299
    .line 300
    if-eqz v5, :cond_10

    .line 301
    .line 302
    new-instance v0, Lx3/d;

    .line 303
    .line 304
    invoke-direct {v0}, Lx3/d;-><init>()V

    .line 305
    .line 306
    .line 307
    :goto_a
    new-instance v5, LS3/b;

    .line 308
    .line 309
    invoke-direct {v5, v0, v6, v7}, LS3/b;-><init>(Lq3/j;Lj3/M;Ll4/x;)V

    .line 310
    .line 311
    .line 312
    move-wide/from16 v21, v8

    .line 313
    .line 314
    move/from16 v23, v11

    .line 315
    .line 316
    goto/16 :goto_1b

    .line 317
    .line 318
    :cond_10
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    const-string v3, "Unexpected extractor type for recreation: "

    .line 329
    .line 330
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    throw v2

    .line 338
    :cond_11
    iget-object v6, v1, LS3/k;->v:LS3/c;

    .line 339
    .line 340
    iget-object v0, v0, Lk4/p;->a:Landroid/net/Uri;

    .line 341
    .line 342
    iget-object v7, v1, LP3/e;->d:Lj3/M;

    .line 343
    .line 344
    iget-object v14, v1, LS3/k;->w:Ljava/util/List;

    .line 345
    .line 346
    iget-object v15, v1, LS3/k;->u:Ll4/x;

    .line 347
    .line 348
    move-wide/from16 v21, v8

    .line 349
    .line 350
    invoke-interface/range {p1 .. p1}, Lk4/m;->l()Ljava/util/Map;

    .line 351
    .line 352
    .line 353
    move-result-object v8

    .line 354
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    iget-object v6, v7, Lj3/M;->l:Ljava/lang/String;

    .line 358
    .line 359
    invoke-static {v6}, Ll4/a;->B(Ljava/lang/String;)I

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    const-string v9, "Content-Type"

    .line 364
    .line 365
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v8

    .line 369
    check-cast v8, Ljava/util/List;

    .line 370
    .line 371
    if-eqz v8, :cond_13

    .line 372
    .line 373
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 374
    .line 375
    .line 376
    move-result v16

    .line 377
    if-eqz v16, :cond_12

    .line 378
    .line 379
    goto :goto_b

    .line 380
    :cond_12
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v8

    .line 384
    check-cast v8, Ljava/lang/String;

    .line 385
    .line 386
    goto :goto_c

    .line 387
    :cond_13
    :goto_b
    const/4 v8, 0x0

    .line 388
    :goto_c
    invoke-static {v8}, Ll4/a;->B(Ljava/lang/String;)I

    .line 389
    .line 390
    .line 391
    move-result v8

    .line 392
    invoke-static {v0}, Ll4/a;->C(Landroid/net/Uri;)I

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    new-instance v9, Ljava/util/ArrayList;

    .line 397
    .line 398
    const/4 v12, 0x7

    .line 399
    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 400
    .line 401
    .line 402
    invoke-static {v6, v9}, LS3/c;->a(ILjava/util/ArrayList;)V

    .line 403
    .line 404
    .line 405
    invoke-static {v8, v9}, LS3/c;->a(ILjava/util/ArrayList;)V

    .line 406
    .line 407
    .line 408
    invoke-static {v0, v9}, LS3/c;->a(ILjava/util/ArrayList;)V

    .line 409
    .line 410
    .line 411
    sget-object v13, LS3/c;->b:[I

    .line 412
    .line 413
    move v5, v10

    .line 414
    :goto_d
    if-ge v5, v12, :cond_14

    .line 415
    .line 416
    aget v12, v13, v5

    .line 417
    .line 418
    invoke-static {v12, v9}, LS3/c;->a(ILjava/util/ArrayList;)V

    .line 419
    .line 420
    .line 421
    add-int/lit8 v5, v5, 0x1

    .line 422
    .line 423
    const/4 v12, 0x7

    .line 424
    goto :goto_d

    .line 425
    :cond_14
    iput v10, v2, Lq3/g;->f:I

    .line 426
    .line 427
    move v5, v10

    .line 428
    const/4 v12, 0x0

    .line 429
    :goto_e
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 430
    .line 431
    .line 432
    move-result v13

    .line 433
    if-ge v5, v13, :cond_28

    .line 434
    .line 435
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v13

    .line 439
    check-cast v13, Ljava/lang/Integer;

    .line 440
    .line 441
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 442
    .line 443
    .line 444
    move-result v13

    .line 445
    const/16 v10, 0xb

    .line 446
    .line 447
    if-eqz v13, :cond_24

    .line 448
    .line 449
    if-eq v13, v11, :cond_23

    .line 450
    .line 451
    move/from16 v23, v11

    .line 452
    .line 453
    const/4 v11, 0x2

    .line 454
    if-eq v13, v11, :cond_22

    .line 455
    .line 456
    const/4 v11, 0x7

    .line 457
    if-eq v13, v11, :cond_21

    .line 458
    .line 459
    const/16 v11, 0x8

    .line 460
    .line 461
    if-eq v13, v11, :cond_1b

    .line 462
    .line 463
    if-eq v13, v10, :cond_16

    .line 464
    .line 465
    const/16 v11, 0xd

    .line 466
    .line 467
    if-eq v13, v11, :cond_15

    .line 468
    .line 469
    move/from16 v24, v5

    .line 470
    .line 471
    move-object/from16 v25, v9

    .line 472
    .line 473
    move-object v5, v15

    .line 474
    const/4 v11, 0x0

    .line 475
    goto/16 :goto_18

    .line 476
    .line 477
    :cond_15
    new-instance v11, LS3/v;

    .line 478
    .line 479
    iget-object v10, v7, Lj3/M;->c:Ljava/lang/String;

    .line 480
    .line 481
    invoke-direct {v11, v10, v15}, LS3/v;-><init>(Ljava/lang/String;Ll4/x;)V

    .line 482
    .line 483
    .line 484
    move/from16 v24, v5

    .line 485
    .line 486
    move-object/from16 v25, v9

    .line 487
    .line 488
    :goto_f
    move-object v5, v15

    .line 489
    goto/16 :goto_18

    .line 490
    .line 491
    :cond_16
    if-eqz v14, :cond_17

    .line 492
    .line 493
    const/16 v10, 0x30

    .line 494
    .line 495
    move-object v11, v14

    .line 496
    :goto_10
    move/from16 v24, v5

    .line 497
    .line 498
    goto :goto_11

    .line 499
    :cond_17
    new-instance v10, Lj3/L;

    .line 500
    .line 501
    invoke-direct {v10}, Lj3/L;-><init>()V

    .line 502
    .line 503
    .line 504
    const-string v11, "application/cea-608"

    .line 505
    .line 506
    iput-object v11, v10, Lj3/L;->k:Ljava/lang/String;

    .line 507
    .line 508
    new-instance v11, Lj3/M;

    .line 509
    .line 510
    invoke-direct {v11, v10}, Lj3/M;-><init>(Lj3/L;)V

    .line 511
    .line 512
    .line 513
    invoke-static {v11}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 514
    .line 515
    .line 516
    move-result-object v10

    .line 517
    const/16 v11, 0x10

    .line 518
    .line 519
    move/from16 v24, v11

    .line 520
    .line 521
    move-object v11, v10

    .line 522
    move/from16 v10, v24

    .line 523
    .line 524
    goto :goto_10

    .line 525
    :goto_11
    iget-object v5, v7, Lj3/M;->i:Ljava/lang/String;

    .line 526
    .line 527
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 528
    .line 529
    .line 530
    move-result v17

    .line 531
    move-object/from16 v25, v9

    .line 532
    .line 533
    if-nez v17, :cond_1a

    .line 534
    .line 535
    const-string v9, "audio/mp4a-latm"

    .line 536
    .line 537
    invoke-static {v5, v9}, Ll4/n;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v9

    .line 541
    if-eqz v9, :cond_18

    .line 542
    .line 543
    goto :goto_12

    .line 544
    :cond_18
    or-int/lit8 v10, v10, 0x2

    .line 545
    .line 546
    :goto_12
    const-string v9, "video/avc"

    .line 547
    .line 548
    invoke-static {v5, v9}, Ll4/n;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v5

    .line 552
    if-eqz v5, :cond_19

    .line 553
    .line 554
    goto :goto_13

    .line 555
    :cond_19
    or-int/lit8 v10, v10, 0x4

    .line 556
    .line 557
    :cond_1a
    :goto_13
    new-instance v5, LA3/G;

    .line 558
    .line 559
    new-instance v9, LA3/f;

    .line 560
    .line 561
    invoke-direct {v9, v11, v10}, LA3/f;-><init>(Ljava/util/List;I)V

    .line 562
    .line 563
    .line 564
    const/4 v10, 0x2

    .line 565
    invoke-direct {v5, v10, v15, v9}, LA3/G;-><init>(ILl4/x;LA3/f;)V

    .line 566
    .line 567
    .line 568
    move-object v11, v5

    .line 569
    goto :goto_f

    .line 570
    :cond_1b
    move/from16 v24, v5

    .line 571
    .line 572
    move-object/from16 v25, v9

    .line 573
    .line 574
    move-object/from16 v17, v15

    .line 575
    .line 576
    new-instance v15, Ly3/i;

    .line 577
    .line 578
    iget-object v5, v7, Lj3/M;->j:LD3/c;

    .line 579
    .line 580
    if-nez v5, :cond_1d

    .line 581
    .line 582
    :cond_1c
    const/4 v5, 0x0

    .line 583
    goto :goto_15

    .line 584
    :cond_1d
    const/4 v9, 0x0

    .line 585
    :goto_14
    iget-object v10, v5, LD3/c;->a:[LD3/b;

    .line 586
    .line 587
    array-length v11, v10

    .line 588
    if-ge v9, v11, :cond_1c

    .line 589
    .line 590
    aget-object v10, v10, v9

    .line 591
    .line 592
    instance-of v11, v10, LS3/u;

    .line 593
    .line 594
    if-eqz v11, :cond_1e

    .line 595
    .line 596
    check-cast v10, LS3/u;

    .line 597
    .line 598
    iget-object v5, v10, LS3/u;->c:Ljava/util/List;

    .line 599
    .line 600
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 601
    .line 602
    .line 603
    move-result v5

    .line 604
    xor-int/lit8 v5, v5, 0x1

    .line 605
    .line 606
    goto :goto_15

    .line 607
    :cond_1e
    add-int/lit8 v9, v9, 0x1

    .line 608
    .line 609
    goto :goto_14

    .line 610
    :goto_15
    if-eqz v5, :cond_1f

    .line 611
    .line 612
    const/4 v5, 0x4

    .line 613
    move/from16 v16, v5

    .line 614
    .line 615
    goto :goto_16

    .line 616
    :cond_1f
    const/16 v16, 0x0

    .line 617
    .line 618
    :goto_16
    if-eqz v14, :cond_20

    .line 619
    .line 620
    move-object/from16 v19, v14

    .line 621
    .line 622
    goto :goto_17

    .line 623
    :cond_20
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 624
    .line 625
    move-object/from16 v19, v5

    .line 626
    .line 627
    :goto_17
    const/16 v20, 0x0

    .line 628
    .line 629
    const/16 v18, 0x0

    .line 630
    .line 631
    invoke-direct/range {v15 .. v20}, Ly3/i;-><init>(ILl4/x;Ly3/o;Ljava/util/List;LQ3/o;)V

    .line 632
    .line 633
    .line 634
    move-object/from16 v5, v17

    .line 635
    .line 636
    move-object v11, v15

    .line 637
    goto :goto_18

    .line 638
    :cond_21
    move/from16 v24, v5

    .line 639
    .line 640
    move-object/from16 v25, v9

    .line 641
    .line 642
    move-object v5, v15

    .line 643
    new-instance v11, Lx3/d;

    .line 644
    .line 645
    const-wide/16 v9, 0x0

    .line 646
    .line 647
    invoke-direct {v11, v9, v10}, Lx3/d;-><init>(J)V

    .line 648
    .line 649
    .line 650
    goto :goto_18

    .line 651
    :cond_22
    move/from16 v24, v5

    .line 652
    .line 653
    move-object/from16 v25, v9

    .line 654
    .line 655
    move-object v5, v15

    .line 656
    new-instance v11, LA3/d;

    .line 657
    .line 658
    invoke-direct {v11}, LA3/d;-><init>()V

    .line 659
    .line 660
    .line 661
    goto :goto_18

    .line 662
    :cond_23
    move/from16 v24, v5

    .line 663
    .line 664
    move-object/from16 v25, v9

    .line 665
    .line 666
    move/from16 v23, v11

    .line 667
    .line 668
    move-object v5, v15

    .line 669
    new-instance v11, LA3/c;

    .line 670
    .line 671
    invoke-direct {v11}, LA3/c;-><init>()V

    .line 672
    .line 673
    .line 674
    goto :goto_18

    .line 675
    :cond_24
    move/from16 v24, v5

    .line 676
    .line 677
    move-object/from16 v25, v9

    .line 678
    .line 679
    move/from16 v23, v11

    .line 680
    .line 681
    move-object v5, v15

    .line 682
    new-instance v11, LA3/a;

    .line 683
    .line 684
    invoke-direct {v11}, LA3/a;-><init>()V

    .line 685
    .line 686
    .line 687
    :goto_18
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    :try_start_8
    invoke-interface {v11, v2}, Lq3/j;->j(Lq3/k;)Z

    .line 691
    .line 692
    .line 693
    move-result v9
    :try_end_8
    .catch Ljava/io/EOFException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 694
    const/4 v10, 0x0

    .line 695
    iput v10, v2, Lq3/g;->f:I

    .line 696
    .line 697
    goto :goto_19

    .line 698
    :catchall_1
    move-exception v0

    .line 699
    const/4 v10, 0x0

    .line 700
    iput v10, v2, Lq3/g;->f:I

    .line 701
    .line 702
    throw v0

    .line 703
    :catch_2
    const/4 v10, 0x0

    .line 704
    iput v10, v2, Lq3/g;->f:I

    .line 705
    .line 706
    move v9, v10

    .line 707
    :goto_19
    if-eqz v9, :cond_25

    .line 708
    .line 709
    new-instance v0, LS3/b;

    .line 710
    .line 711
    invoke-direct {v0, v11, v7, v5}, LS3/b;-><init>(Lq3/j;Lj3/M;Ll4/x;)V

    .line 712
    .line 713
    .line 714
    :goto_1a
    move-object v5, v0

    .line 715
    goto :goto_1b

    .line 716
    :cond_25
    if-nez v12, :cond_27

    .line 717
    .line 718
    if-eq v13, v6, :cond_26

    .line 719
    .line 720
    if-eq v13, v8, :cond_26

    .line 721
    .line 722
    if-eq v13, v0, :cond_26

    .line 723
    .line 724
    const/16 v9, 0xb

    .line 725
    .line 726
    if-ne v13, v9, :cond_27

    .line 727
    .line 728
    :cond_26
    move-object v12, v11

    .line 729
    :cond_27
    add-int/lit8 v9, v24, 0x1

    .line 730
    .line 731
    move-object v15, v5

    .line 732
    move v5, v9

    .line 733
    move/from16 v11, v23

    .line 734
    .line 735
    move-object/from16 v9, v25

    .line 736
    .line 737
    goto/16 :goto_e

    .line 738
    .line 739
    :cond_28
    move/from16 v23, v11

    .line 740
    .line 741
    move-object v5, v15

    .line 742
    new-instance v0, LS3/b;

    .line 743
    .line 744
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    invoke-direct {v0, v12, v7, v5}, LS3/b;-><init>(Lq3/j;Lj3/M;Ll4/x;)V

    .line 748
    .line 749
    .line 750
    goto :goto_1a

    .line 751
    :goto_1b
    iput-object v5, v1, LS3/k;->C:LS3/b;

    .line 752
    .line 753
    iget-object v0, v5, LS3/b;->a:Lq3/j;

    .line 754
    .line 755
    instance-of v5, v0, LA3/d;

    .line 756
    .line 757
    if-nez v5, :cond_2a

    .line 758
    .line 759
    instance-of v5, v0, LA3/a;

    .line 760
    .line 761
    if-nez v5, :cond_2a

    .line 762
    .line 763
    instance-of v5, v0, LA3/c;

    .line 764
    .line 765
    if-nez v5, :cond_2a

    .line 766
    .line 767
    instance-of v0, v0, Lx3/d;

    .line 768
    .line 769
    if-eqz v0, :cond_29

    .line 770
    .line 771
    goto :goto_1c

    .line 772
    :cond_29
    move v0, v10

    .line 773
    goto :goto_1d

    .line 774
    :cond_2a
    :goto_1c
    move/from16 v0, v23

    .line 775
    .line 776
    :goto_1d
    if-eqz v0, :cond_2d

    .line 777
    .line 778
    iget-object v0, v1, LS3/k;->D:LS3/r;

    .line 779
    .line 780
    cmp-long v5, v3, v21

    .line 781
    .line 782
    if-eqz v5, :cond_2b

    .line 783
    .line 784
    iget-object v5, v1, LS3/k;->u:Ll4/x;

    .line 785
    .line 786
    invoke-virtual {v5, v3, v4}, Ll4/x;->b(J)J

    .line 787
    .line 788
    .line 789
    move-result-wide v3

    .line 790
    goto :goto_1e

    .line 791
    :cond_2b
    iget-wide v3, v1, LP3/e;->g:J

    .line 792
    .line 793
    :goto_1e
    iget-wide v5, v0, LS3/r;->t0:J

    .line 794
    .line 795
    cmp-long v5, v5, v3

    .line 796
    .line 797
    if-eqz v5, :cond_2f

    .line 798
    .line 799
    iput-wide v3, v0, LS3/r;->t0:J

    .line 800
    .line 801
    iget-object v0, v0, LS3/r;->v:[LS3/q;

    .line 802
    .line 803
    array-length v5, v0

    .line 804
    move v6, v10

    .line 805
    :goto_1f
    if-ge v6, v5, :cond_2f

    .line 806
    .line 807
    aget-object v7, v0, v6

    .line 808
    .line 809
    iget-wide v8, v7, LN3/c0;->F:J

    .line 810
    .line 811
    cmp-long v8, v8, v3

    .line 812
    .line 813
    if-eqz v8, :cond_2c

    .line 814
    .line 815
    iput-wide v3, v7, LN3/c0;->F:J

    .line 816
    .line 817
    move/from16 v8, v23

    .line 818
    .line 819
    iput-boolean v8, v7, LN3/c0;->z:Z

    .line 820
    .line 821
    :cond_2c
    add-int/lit8 v6, v6, 0x1

    .line 822
    .line 823
    const/16 v23, 0x1

    .line 824
    .line 825
    goto :goto_1f

    .line 826
    :cond_2d
    iget-object v0, v1, LS3/k;->D:LS3/r;

    .line 827
    .line 828
    iget-wide v3, v0, LS3/r;->t0:J

    .line 829
    .line 830
    const-wide/16 v5, 0x0

    .line 831
    .line 832
    cmp-long v3, v3, v5

    .line 833
    .line 834
    if-eqz v3, :cond_2f

    .line 835
    .line 836
    iput-wide v5, v0, LS3/r;->t0:J

    .line 837
    .line 838
    iget-object v0, v0, LS3/r;->v:[LS3/q;

    .line 839
    .line 840
    array-length v3, v0

    .line 841
    move v4, v10

    .line 842
    :goto_20
    if-ge v4, v3, :cond_2f

    .line 843
    .line 844
    aget-object v7, v0, v4

    .line 845
    .line 846
    iget-wide v8, v7, LN3/c0;->F:J

    .line 847
    .line 848
    cmp-long v8, v8, v5

    .line 849
    .line 850
    if-eqz v8, :cond_2e

    .line 851
    .line 852
    iput-wide v5, v7, LN3/c0;->F:J

    .line 853
    .line 854
    const/4 v8, 0x1

    .line 855
    iput-boolean v8, v7, LN3/c0;->z:Z

    .line 856
    .line 857
    :cond_2e
    add-int/lit8 v4, v4, 0x1

    .line 858
    .line 859
    goto :goto_20

    .line 860
    :cond_2f
    iget-object v0, v1, LS3/k;->D:LS3/r;

    .line 861
    .line 862
    iget-object v0, v0, LS3/r;->x:Ljava/util/HashSet;

    .line 863
    .line 864
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 865
    .line 866
    .line 867
    iget-object v0, v1, LS3/k;->C:LS3/b;

    .line 868
    .line 869
    iget-object v3, v1, LS3/k;->D:LS3/r;

    .line 870
    .line 871
    iget-object v0, v0, LS3/b;->a:Lq3/j;

    .line 872
    .line 873
    invoke-interface {v0, v3}, Lq3/j;->i(Lq3/l;)V

    .line 874
    .line 875
    .line 876
    :cond_30
    iget-object v0, v1, LS3/k;->D:LS3/r;

    .line 877
    .line 878
    iget-object v3, v1, LS3/k;->x:Ln3/g;

    .line 879
    .line 880
    iget-object v4, v0, LS3/r;->u0:Ln3/g;

    .line 881
    .line 882
    invoke-static {v4, v3}, Ll4/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 883
    .line 884
    .line 885
    move-result v4

    .line 886
    if-nez v4, :cond_32

    .line 887
    .line 888
    iput-object v3, v0, LS3/r;->u0:Ln3/g;

    .line 889
    .line 890
    :goto_21
    iget-object v4, v0, LS3/r;->v:[LS3/q;

    .line 891
    .line 892
    array-length v5, v4

    .line 893
    if-ge v10, v5, :cond_32

    .line 894
    .line 895
    iget-object v5, v0, LS3/r;->m0:[Z

    .line 896
    .line 897
    aget-boolean v5, v5, v10

    .line 898
    .line 899
    if-eqz v5, :cond_31

    .line 900
    .line 901
    aget-object v4, v4, v10

    .line 902
    .line 903
    iput-object v3, v4, LS3/q;->I:Ln3/g;

    .line 904
    .line 905
    const/4 v8, 0x1

    .line 906
    iput-boolean v8, v4, LN3/c0;->z:Z

    .line 907
    .line 908
    goto :goto_22

    .line 909
    :cond_31
    const/4 v8, 0x1

    .line 910
    :goto_22
    add-int/lit8 v10, v10, 0x1

    .line 911
    .line 912
    goto :goto_21

    .line 913
    :cond_32
    return-object v2
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
.end method

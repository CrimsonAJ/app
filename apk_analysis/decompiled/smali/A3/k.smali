.class public final LA3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA3/i;


# static fields
.field public static final q:[D


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lq3/u;

.field public final c:LA3/D;

.field public final d:LA4/r;

.field public final e:LA3/v;

.field public final f:[Z

.field public final g:LA3/j;

.field public h:J

.field public i:Z

.field public j:Z

.field public k:J

.field public l:J

.field public m:J

.field public n:J

.field public o:Z

.field public p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [D

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LA3/k;->q:[D

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 8
        0x4037f9dcb5112287L    # 23.976023976023978
        0x4038000000000000L    # 24.0
        0x4039000000000000L    # 25.0
        0x403df853e2556b28L    # 29.97002997002997
        0x403e000000000000L    # 30.0
        0x4049000000000000L    # 50.0
        0x404df853e2556b28L    # 59.94005994005994
        0x404e000000000000L    # 60.0
    .end array-data
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

.method public constructor <init>(LA3/D;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA3/k;->c:LA3/D;

    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    new-array v0, v0, [Z

    .line 8
    .line 9
    iput-object v0, p0, LA3/k;->f:[Z

    .line 10
    .line 11
    new-instance v0, LA3/j;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x80

    .line 17
    .line 18
    new-array v1, v1, [B

    .line 19
    .line 20
    iput-object v1, v0, LA3/j;->d:[B

    .line 21
    .line 22
    iput-object v0, p0, LA3/k;->g:LA3/j;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    new-instance p1, LA3/v;

    .line 27
    .line 28
    const/16 v0, 0xb2

    .line 29
    .line 30
    invoke-direct {p1, v0}, LA3/v;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, LA3/k;->e:LA3/v;

    .line 34
    .line 35
    new-instance p1, LA4/r;

    .line 36
    .line 37
    const/4 v0, 0x5

    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {p1, v0, v1}, LA4/r;-><init>(IZ)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, LA3/k;->d:LA4/r;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, LA3/k;->e:LA3/v;

    .line 47
    .line 48
    iput-object p1, p0, LA3/k;->d:LA4/r;

    .line 49
    .line 50
    :goto_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    iput-wide v0, p0, LA3/k;->l:J

    .line 56
    .line 57
    iput-wide v0, p0, LA3/k;->n:J

    .line 58
    .line 59
    return-void
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
    iget-object v0, p0, LA3/k;->f:[Z

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->q([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA3/k;->g:LA3/j;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, LA3/j;->a:Z

    .line 10
    .line 11
    iput v1, v0, LA3/j;->b:I

    .line 12
    .line 13
    iput v1, v0, LA3/j;->c:I

    .line 14
    .line 15
    iget-object v0, p0, LA3/k;->e:LA3/v;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, LA3/v;->f()V

    .line 20
    .line 21
    .line 22
    :cond_0
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    iput-wide v2, p0, LA3/k;->h:J

    .line 25
    .line 26
    iput-boolean v1, p0, LA3/k;->i:Z

    .line 27
    .line 28
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide v0, p0, LA3/k;->l:J

    .line 34
    .line 35
    iput-wide v0, p0, LA3/k;->n:J

    .line 36
    .line 37
    return-void
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

.method public final c(LA4/r;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v5, 0x3

    .line 6
    iget-object v6, v0, LA3/k;->b:Lq3/u;

    .line 7
    .line 8
    invoke-static {v6}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget v6, v1, LA4/r;->a:I

    .line 12
    .line 13
    iget v7, v1, LA4/r;->b:I

    .line 14
    .line 15
    iget-object v8, v1, LA4/r;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v8, [B

    .line 18
    .line 19
    iget-wide v9, v0, LA3/k;->h:J

    .line 20
    .line 21
    invoke-virtual {v1}, LA4/r;->e()I

    .line 22
    .line 23
    .line 24
    move-result v11

    .line 25
    int-to-long v11, v11

    .line 26
    add-long/2addr v9, v11

    .line 27
    iput-wide v9, v0, LA3/k;->h:J

    .line 28
    .line 29
    iget-object v9, v0, LA3/k;->b:Lq3/u;

    .line 30
    .line 31
    invoke-virtual {v1}, LA4/r;->e()I

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    invoke-interface {v9, v10, v1}, Lq3/u;->c(ILA4/r;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v9, v0, LA3/k;->f:[Z

    .line 39
    .line 40
    invoke-static {v8, v6, v7, v9}, Ll4/a;->w([BII[Z)I

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    iget-object v10, v0, LA3/k;->g:LA3/j;

    .line 45
    .line 46
    iget-object v11, v0, LA3/k;->e:LA3/v;

    .line 47
    .line 48
    if-ne v9, v7, :cond_2

    .line 49
    .line 50
    iget-boolean v1, v0, LA3/k;->j:Z

    .line 51
    .line 52
    if-nez v1, :cond_0

    .line 53
    .line 54
    invoke-virtual {v10, v8, v6, v7}, LA3/j;->a([BII)V

    .line 55
    .line 56
    .line 57
    :cond_0
    if-eqz v11, :cond_1

    .line 58
    .line 59
    invoke-virtual {v11, v8, v6, v7}, LA3/v;->a([BII)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void

    .line 63
    :cond_2
    iget-object v12, v1, LA4/r;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v12, [B

    .line 66
    .line 67
    add-int/lit8 v13, v9, 0x3

    .line 68
    .line 69
    aget-byte v12, v12, v13

    .line 70
    .line 71
    and-int/lit16 v12, v12, 0xff

    .line 72
    .line 73
    sub-int v14, v9, v6

    .line 74
    .line 75
    iget-boolean v15, v0, LA3/k;->j:Z

    .line 76
    .line 77
    const/16 v16, 0x1

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    if-nez v15, :cond_d

    .line 81
    .line 82
    if-lez v14, :cond_3

    .line 83
    .line 84
    invoke-virtual {v10, v8, v6, v9}, LA3/j;->a([BII)V

    .line 85
    .line 86
    .line 87
    :cond_3
    if-gez v14, :cond_4

    .line 88
    .line 89
    neg-int v15, v14

    .line 90
    :goto_1
    const/16 v17, 0x4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move v15, v4

    .line 94
    goto :goto_1

    .line 95
    :goto_2
    iget-boolean v3, v10, LA3/j;->a:Z

    .line 96
    .line 97
    if-eqz v3, :cond_b

    .line 98
    .line 99
    iget v3, v10, LA3/j;->b:I

    .line 100
    .line 101
    sub-int/2addr v3, v15

    .line 102
    iput v3, v10, LA3/j;->b:I

    .line 103
    .line 104
    iget v15, v10, LA3/j;->c:I

    .line 105
    .line 106
    if-nez v15, :cond_5

    .line 107
    .line 108
    const/16 v15, 0xb5

    .line 109
    .line 110
    if-ne v12, v15, :cond_5

    .line 111
    .line 112
    iput v3, v10, LA3/j;->c:I

    .line 113
    .line 114
    goto/16 :goto_7

    .line 115
    .line 116
    :cond_5
    iput-boolean v4, v10, LA3/j;->a:Z

    .line 117
    .line 118
    iget-object v3, v0, LA3/k;->a:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object v15, v10, LA3/j;->d:[B

    .line 124
    .line 125
    iget v4, v10, LA3/j;->b:I

    .line 126
    .line 127
    invoke-static {v15, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    aget-byte v15, v4, v17

    .line 132
    .line 133
    and-int/lit16 v15, v15, 0xff

    .line 134
    .line 135
    const/16 v18, 0x5

    .line 136
    .line 137
    aget-byte v5, v4, v18

    .line 138
    .line 139
    and-int/lit16 v2, v5, 0xff

    .line 140
    .line 141
    const/16 v21, 0x6

    .line 142
    .line 143
    move/from16 v22, v2

    .line 144
    .line 145
    aget-byte v2, v4, v21

    .line 146
    .line 147
    and-int/lit16 v2, v2, 0xff

    .line 148
    .line 149
    shl-int/lit8 v15, v15, 0x4

    .line 150
    .line 151
    shr-int/lit8 v21, v22, 0x4

    .line 152
    .line 153
    or-int v15, v15, v21

    .line 154
    .line 155
    and-int/lit8 v5, v5, 0xf

    .line 156
    .line 157
    move/from16 v21, v2

    .line 158
    .line 159
    const/16 v2, 0x8

    .line 160
    .line 161
    shl-int/2addr v5, v2

    .line 162
    or-int v5, v5, v21

    .line 163
    .line 164
    const/16 v21, 0x7

    .line 165
    .line 166
    aget-byte v2, v4, v21

    .line 167
    .line 168
    and-int/lit16 v2, v2, 0xf0

    .line 169
    .line 170
    shr-int/lit8 v2, v2, 0x4

    .line 171
    .line 172
    move-object/from16 v23, v4

    .line 173
    .line 174
    const/4 v4, 0x2

    .line 175
    if-eq v2, v4, :cond_8

    .line 176
    .line 177
    const/4 v4, 0x3

    .line 178
    if-eq v2, v4, :cond_7

    .line 179
    .line 180
    move/from16 v4, v17

    .line 181
    .line 182
    if-eq v2, v4, :cond_6

    .line 183
    .line 184
    const/high16 v2, 0x3f800000    # 1.0f

    .line 185
    .line 186
    :goto_3
    const/16 v17, 0x4

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_6
    mul-int/lit8 v2, v5, 0x79

    .line 190
    .line 191
    int-to-float v2, v2

    .line 192
    mul-int/lit8 v4, v15, 0x64

    .line 193
    .line 194
    :goto_4
    int-to-float v4, v4

    .line 195
    div-float/2addr v2, v4

    .line 196
    goto :goto_3

    .line 197
    :cond_7
    mul-int/lit8 v2, v5, 0x10

    .line 198
    .line 199
    int-to-float v2, v2

    .line 200
    mul-int/lit8 v4, v15, 0x9

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_8
    mul-int/lit8 v2, v5, 0x4

    .line 204
    .line 205
    int-to-float v2, v2

    .line 206
    const/16 v19, 0x3

    .line 207
    .line 208
    mul-int/lit8 v4, v15, 0x3

    .line 209
    .line 210
    int-to-float v4, v4

    .line 211
    div-float/2addr v2, v4

    .line 212
    :goto_5
    new-instance v4, Lj3/L;

    .line 213
    .line 214
    invoke-direct {v4}, Lj3/L;-><init>()V

    .line 215
    .line 216
    .line 217
    iput-object v3, v4, Lj3/L;->a:Ljava/lang/String;

    .line 218
    .line 219
    const-string v3, "video/mpeg2"

    .line 220
    .line 221
    iput-object v3, v4, Lj3/L;->k:Ljava/lang/String;

    .line 222
    .line 223
    iput v15, v4, Lj3/L;->p:I

    .line 224
    .line 225
    iput v5, v4, Lj3/L;->q:I

    .line 226
    .line 227
    iput v2, v4, Lj3/L;->t:F

    .line 228
    .line 229
    invoke-static/range {v23 .. v23}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    iput-object v2, v4, Lj3/L;->m:Ljava/util/List;

    .line 234
    .line 235
    new-instance v2, Lj3/M;

    .line 236
    .line 237
    invoke-direct {v2, v4}, Lj3/M;-><init>(Lj3/L;)V

    .line 238
    .line 239
    .line 240
    aget-byte v3, v23, v21

    .line 241
    .line 242
    and-int/lit8 v3, v3, 0xf

    .line 243
    .line 244
    add-int/lit8 v3, v3, -0x1

    .line 245
    .line 246
    if-ltz v3, :cond_a

    .line 247
    .line 248
    const/16 v4, 0x8

    .line 249
    .line 250
    if-ge v3, v4, :cond_a

    .line 251
    .line 252
    sget-object v4, LA3/k;->q:[D

    .line 253
    .line 254
    aget-wide v3, v4, v3

    .line 255
    .line 256
    iget v5, v10, LA3/j;->c:I

    .line 257
    .line 258
    add-int/lit8 v5, v5, 0x9

    .line 259
    .line 260
    aget-byte v5, v23, v5

    .line 261
    .line 262
    and-int/lit8 v10, v5, 0x60

    .line 263
    .line 264
    shr-int/lit8 v10, v10, 0x5

    .line 265
    .line 266
    and-int/lit8 v5, v5, 0x1f

    .line 267
    .line 268
    move-wide/from16 v21, v3

    .line 269
    .line 270
    if-eq v10, v5, :cond_9

    .line 271
    .line 272
    int-to-double v3, v10

    .line 273
    const-wide/high16 v23, 0x3ff0000000000000L    # 1.0

    .line 274
    .line 275
    add-double v3, v3, v23

    .line 276
    .line 277
    add-int/lit8 v5, v5, 0x1

    .line 278
    .line 279
    move-wide/from16 v23, v3

    .line 280
    .line 281
    int-to-double v3, v5

    .line 282
    div-double v3, v23, v3

    .line 283
    .line 284
    mul-double v3, v3, v21

    .line 285
    .line 286
    :cond_9
    const-wide v21, 0x412e848000000000L    # 1000000.0

    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    div-double v3, v21, v3

    .line 292
    .line 293
    double-to-long v3, v3

    .line 294
    goto :goto_6

    .line 295
    :cond_a
    const-wide/16 v3, 0x0

    .line 296
    .line 297
    :goto_6
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    iget-object v3, v0, LA3/k;->b:Lq3/u;

    .line 306
    .line 307
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v4, Lj3/M;

    .line 310
    .line 311
    invoke-interface {v3, v4}, Lq3/u;->e(Lj3/M;)V

    .line 312
    .line 313
    .line 314
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v2, Ljava/lang/Long;

    .line 317
    .line 318
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 319
    .line 320
    .line 321
    move-result-wide v2

    .line 322
    iput-wide v2, v0, LA3/k;->k:J

    .line 323
    .line 324
    move/from16 v2, v16

    .line 325
    .line 326
    iput-boolean v2, v0, LA3/k;->j:Z

    .line 327
    .line 328
    const/4 v4, 0x3

    .line 329
    goto :goto_8

    .line 330
    :cond_b
    move/from16 v2, v16

    .line 331
    .line 332
    const/16 v3, 0xb3

    .line 333
    .line 334
    if-ne v12, v3, :cond_c

    .line 335
    .line 336
    iput-boolean v2, v10, LA3/j;->a:Z

    .line 337
    .line 338
    :cond_c
    :goto_7
    sget-object v2, LA3/j;->e:[B

    .line 339
    .line 340
    const/4 v3, 0x0

    .line 341
    const/4 v4, 0x3

    .line 342
    invoke-virtual {v10, v2, v3, v4}, LA3/j;->a([BII)V

    .line 343
    .line 344
    .line 345
    goto :goto_8

    .line 346
    :cond_d
    move v4, v5

    .line 347
    const/16 v17, 0x4

    .line 348
    .line 349
    :goto_8
    if-eqz v11, :cond_10

    .line 350
    .line 351
    if-lez v14, :cond_e

    .line 352
    .line 353
    invoke-virtual {v11, v8, v6, v9}, LA3/v;->a([BII)V

    .line 354
    .line 355
    .line 356
    const/4 v3, 0x0

    .line 357
    goto :goto_9

    .line 358
    :cond_e
    neg-int v3, v14

    .line 359
    :goto_9
    invoke-virtual {v11, v3}, LA3/v;->e(I)Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    if-eqz v2, :cond_f

    .line 364
    .line 365
    iget-object v2, v11, LA3/v;->f:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v2, [B

    .line 368
    .line 369
    iget v3, v11, LA3/v;->c:I

    .line 370
    .line 371
    invoke-static {v3, v2}, Ll4/a;->O(I[B)I

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    sget v3, Ll4/y;->a:I

    .line 376
    .line 377
    iget-object v3, v11, LA3/v;->f:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v3, [B

    .line 380
    .line 381
    iget-object v5, v0, LA3/k;->d:LA4/r;

    .line 382
    .line 383
    invoke-virtual {v5, v2, v3}, LA4/r;->F(I[B)V

    .line 384
    .line 385
    .line 386
    iget-wide v2, v0, LA3/k;->n:J

    .line 387
    .line 388
    iget-object v6, v0, LA3/k;->c:LA3/D;

    .line 389
    .line 390
    invoke-virtual {v6, v2, v3, v5}, LA3/D;->a(JLA4/r;)V

    .line 391
    .line 392
    .line 393
    :cond_f
    const/16 v2, 0xb2

    .line 394
    .line 395
    if-ne v12, v2, :cond_10

    .line 396
    .line 397
    iget-object v2, v1, LA4/r;->c:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v2, [B

    .line 400
    .line 401
    const/16 v20, 0x2

    .line 402
    .line 403
    add-int/lit8 v3, v9, 0x2

    .line 404
    .line 405
    aget-byte v2, v2, v3

    .line 406
    .line 407
    const/4 v3, 0x1

    .line 408
    if-ne v2, v3, :cond_11

    .line 409
    .line 410
    invoke-virtual {v11, v12}, LA3/v;->g(I)V

    .line 411
    .line 412
    .line 413
    goto :goto_a

    .line 414
    :cond_10
    const/4 v3, 0x1

    .line 415
    const/16 v20, 0x2

    .line 416
    .line 417
    :cond_11
    :goto_a
    if-eqz v12, :cond_14

    .line 418
    .line 419
    const/16 v2, 0xb3

    .line 420
    .line 421
    if-ne v12, v2, :cond_12

    .line 422
    .line 423
    goto :goto_b

    .line 424
    :cond_12
    const/16 v2, 0xb8

    .line 425
    .line 426
    if-ne v12, v2, :cond_13

    .line 427
    .line 428
    iput-boolean v3, v0, LA3/k;->o:Z

    .line 429
    .line 430
    :cond_13
    move v2, v3

    .line 431
    goto :goto_f

    .line 432
    :cond_14
    :goto_b
    sub-int v26, v7, v9

    .line 433
    .line 434
    iget-boolean v2, v0, LA3/k;->p:Z

    .line 435
    .line 436
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    if-eqz v2, :cond_15

    .line 442
    .line 443
    iget-boolean v2, v0, LA3/k;->j:Z

    .line 444
    .line 445
    if-eqz v2, :cond_15

    .line 446
    .line 447
    iget-wide v2, v0, LA3/k;->n:J

    .line 448
    .line 449
    cmp-long v9, v2, v5

    .line 450
    .line 451
    if-eqz v9, :cond_15

    .line 452
    .line 453
    iget-boolean v9, v0, LA3/k;->o:Z

    .line 454
    .line 455
    iget-wide v10, v0, LA3/k;->h:J

    .line 456
    .line 457
    iget-wide v14, v0, LA3/k;->m:J

    .line 458
    .line 459
    sub-long/2addr v10, v14

    .line 460
    long-to-int v10, v10

    .line 461
    sub-int v25, v10, v26

    .line 462
    .line 463
    iget-object v10, v0, LA3/k;->b:Lq3/u;

    .line 464
    .line 465
    const/16 v27, 0x0

    .line 466
    .line 467
    move-wide/from16 v22, v2

    .line 468
    .line 469
    move/from16 v24, v9

    .line 470
    .line 471
    move-object/from16 v21, v10

    .line 472
    .line 473
    invoke-interface/range {v21 .. v27}, Lq3/u;->d(JIIILq3/t;)V

    .line 474
    .line 475
    .line 476
    :cond_15
    move/from16 v2, v26

    .line 477
    .line 478
    iget-boolean v3, v0, LA3/k;->i:Z

    .line 479
    .line 480
    if-eqz v3, :cond_17

    .line 481
    .line 482
    iget-boolean v3, v0, LA3/k;->p:Z

    .line 483
    .line 484
    if-eqz v3, :cond_16

    .line 485
    .line 486
    goto :goto_c

    .line 487
    :cond_16
    const/4 v2, 0x1

    .line 488
    const/4 v3, 0x0

    .line 489
    goto :goto_e

    .line 490
    :cond_17
    :goto_c
    iget-wide v9, v0, LA3/k;->h:J

    .line 491
    .line 492
    int-to-long v2, v2

    .line 493
    sub-long/2addr v9, v2

    .line 494
    iput-wide v9, v0, LA3/k;->m:J

    .line 495
    .line 496
    iget-wide v2, v0, LA3/k;->l:J

    .line 497
    .line 498
    cmp-long v9, v2, v5

    .line 499
    .line 500
    if-eqz v9, :cond_18

    .line 501
    .line 502
    goto :goto_d

    .line 503
    :cond_18
    iget-wide v2, v0, LA3/k;->n:J

    .line 504
    .line 505
    cmp-long v9, v2, v5

    .line 506
    .line 507
    if-eqz v9, :cond_19

    .line 508
    .line 509
    iget-wide v9, v0, LA3/k;->k:J

    .line 510
    .line 511
    add-long/2addr v2, v9

    .line 512
    goto :goto_d

    .line 513
    :cond_19
    move-wide v2, v5

    .line 514
    :goto_d
    iput-wide v2, v0, LA3/k;->n:J

    .line 515
    .line 516
    const/4 v3, 0x0

    .line 517
    iput-boolean v3, v0, LA3/k;->o:Z

    .line 518
    .line 519
    iput-wide v5, v0, LA3/k;->l:J

    .line 520
    .line 521
    const/4 v2, 0x1

    .line 522
    iput-boolean v2, v0, LA3/k;->i:Z

    .line 523
    .line 524
    :goto_e
    if-nez v12, :cond_1a

    .line 525
    .line 526
    move v3, v2

    .line 527
    :cond_1a
    iput-boolean v3, v0, LA3/k;->p:Z

    .line 528
    .line 529
    :goto_f
    move v5, v4

    .line 530
    move v6, v13

    .line 531
    goto/16 :goto_0
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method

.method public final d()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final e(JI)V
    .locals 0

    .line 1
    iput-wide p1, p0, LA3/k;->l:J

    .line 2
    .line 3
    return-void
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

.method public final f(Lq3/l;LA3/I;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, LA3/I;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LA3/I;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, LA3/I;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, LA3/k;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, LA3/I;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, LA3/I;->d:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, Lq3/l;->u(II)Lq3/u;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LA3/k;->b:Lq3/u;

    .line 22
    .line 23
    iget-object v0, p0, LA3/k;->c:LA3/D;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, LA3/D;->b(Lq3/l;LA3/I;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
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

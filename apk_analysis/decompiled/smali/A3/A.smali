.class public final LA3/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/j;


# instance fields
.field public final a:Ll4/x;

.field public final b:Landroid/util/SparseArray;

.field public final c:LA4/r;

.field public final d:LA3/y;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:J

.field public i:LA3/x;

.field public j:Lq3/l;

.field public k:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Ll4/x;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {v0, v1, v2}, Ll4/x;-><init>(J)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LA3/A;->a:Ll4/x;

    .line 12
    .line 13
    new-instance v0, LA4/r;

    .line 14
    .line 15
    const/16 v1, 0x1000

    .line 16
    .line 17
    invoke-direct {v0, v1}, LA4/r;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LA3/A;->c:LA4/r;

    .line 21
    .line 22
    new-instance v0, Landroid/util/SparseArray;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LA3/A;->b:Landroid/util/SparseArray;

    .line 28
    .line 29
    new-instance v0, LA3/y;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1}, LA3/y;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, LA3/A;->d:LA3/y;

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


# virtual methods
.method public final a()V
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

.method public final b(JJ)V
    .locals 6

    .line 1
    iget-object p1, p0, LA3/A;->a:Ll4/x;

    .line 2
    .line 3
    invoke-virtual {p1}, Ll4/x;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long p2, v0, v2

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    move p2, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p2, v1

    .line 21
    :goto_0
    if-nez p2, :cond_2

    .line 22
    .line 23
    invoke-virtual {p1}, Ll4/x;->c()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    cmp-long p2, v4, v2

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    cmp-long p2, v4, v2

    .line 34
    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    cmp-long p2, v4, p3

    .line 38
    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v0, v1

    .line 43
    :goto_1
    move p2, v0

    .line 44
    :cond_2
    if-eqz p2, :cond_3

    .line 45
    .line 46
    invoke-virtual {p1, p3, p4}, Ll4/x;->e(J)V

    .line 47
    .line 48
    .line 49
    :cond_3
    iget-object p1, p0, LA3/A;->i:LA3/x;

    .line 50
    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1, p3, p4}, LA3/x;->d(J)V

    .line 54
    .line 55
    .line 56
    :cond_4
    move p1, v1

    .line 57
    :goto_2
    iget-object p2, p0, LA3/A;->b:Landroid/util/SparseArray;

    .line 58
    .line 59
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-ge p1, p3, :cond_5

    .line 64
    .line 65
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    check-cast p2, LA3/z;

    .line 70
    .line 71
    iput-boolean v1, p2, LA3/z;->f:Z

    .line 72
    .line 73
    iget-object p2, p2, LA3/z;->a:LA3/i;

    .line 74
    .line 75
    invoke-interface {p2}, LA3/i;->a()V

    .line 76
    .line 77
    .line 78
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    return-void
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
.end method

.method public final f(Lq3/k;Lc7/j;)I
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, LA3/A;->j:Lq3/l;

    .line 6
    .line 7
    invoke-static {v2}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p1

    .line 11
    .line 12
    check-cast v2, Lq3/g;

    .line 13
    .line 14
    iget-wide v12, v2, Lq3/g;->c:J

    .line 15
    .line 16
    const-wide/16 v17, -0x1

    .line 17
    .line 18
    cmp-long v2, v12, v17

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x4

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v8, 0x3

    .line 24
    const/16 v11, 0x1ba

    .line 25
    .line 26
    iget-object v14, v0, LA3/A;->d:LA3/y;

    .line 27
    .line 28
    if-eqz v2, :cond_b

    .line 29
    .line 30
    iget-boolean v15, v14, LA3/y;->d:Z

    .line 31
    .line 32
    if-nez v15, :cond_b

    .line 33
    .line 34
    iget-boolean v2, v14, LA3/y;->f:Z

    .line 35
    .line 36
    iget-object v12, v14, LA3/y;->c:LA4/r;

    .line 37
    .line 38
    const-wide/16 v15, 0x0

    .line 39
    .line 40
    const-wide/16 v6, 0x4e20

    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    move-object/from16 v2, p1

    .line 45
    .line 46
    check-cast v2, Lq3/g;

    .line 47
    .line 48
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    iget-wide v9, v2, Lq3/g;->c:J

    .line 54
    .line 55
    invoke-static {v6, v7, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v6

    .line 59
    long-to-int v6, v6

    .line 60
    int-to-long v7, v6

    .line 61
    sub-long/2addr v9, v7

    .line 62
    iget-wide v7, v2, Lq3/g;->d:J

    .line 63
    .line 64
    cmp-long v7, v7, v9

    .line 65
    .line 66
    if-eqz v7, :cond_0

    .line 67
    .line 68
    iput-wide v9, v1, Lc7/j;->a:J

    .line 69
    .line 70
    return v3

    .line 71
    :cond_0
    invoke-virtual {v12, v6}, LA4/r;->E(I)V

    .line 72
    .line 73
    .line 74
    iput v5, v2, Lq3/g;->f:I

    .line 75
    .line 76
    iget-object v1, v12, LA4/r;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, [B

    .line 79
    .line 80
    invoke-virtual {v2, v1, v5, v6, v5}, Lq3/g;->t([BIIZ)Z

    .line 81
    .line 82
    .line 83
    iget v1, v12, LA4/r;->a:I

    .line 84
    .line 85
    iget v2, v12, LA4/r;->b:I

    .line 86
    .line 87
    sub-int/2addr v2, v4

    .line 88
    :goto_0
    if-lt v2, v1, :cond_2

    .line 89
    .line 90
    iget-object v4, v12, LA4/r;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v4, [B

    .line 93
    .line 94
    invoke-static {v2, v4}, LA3/y;->b(I[B)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-ne v4, v11, :cond_1

    .line 99
    .line 100
    add-int/lit8 v4, v2, 0x4

    .line 101
    .line 102
    invoke-virtual {v12, v4}, LA4/r;->H(I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v12}, LA3/y;->c(LA4/r;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v6

    .line 109
    cmp-long v4, v6, v19

    .line 110
    .line 111
    if-eqz v4, :cond_1

    .line 112
    .line 113
    move-wide v9, v6

    .line 114
    goto :goto_1

    .line 115
    :cond_1
    add-int/lit8 v2, v2, -0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    move-wide/from16 v9, v19

    .line 119
    .line 120
    :goto_1
    iput-wide v9, v14, LA3/y;->h:J

    .line 121
    .line 122
    iput-boolean v3, v14, LA3/y;->f:Z

    .line 123
    .line 124
    return v5

    .line 125
    :cond_3
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    iget-wide v9, v14, LA3/y;->h:J

    .line 131
    .line 132
    cmp-long v2, v9, v19

    .line 133
    .line 134
    if-nez v2, :cond_4

    .line 135
    .line 136
    move-object/from16 v1, p1

    .line 137
    .line 138
    check-cast v1, Lq3/g;

    .line 139
    .line 140
    invoke-virtual {v14, v1}, LA3/y;->a(Lq3/g;)V

    .line 141
    .line 142
    .line 143
    return v5

    .line 144
    :cond_4
    iget-boolean v2, v14, LA3/y;->e:Z

    .line 145
    .line 146
    if-nez v2, :cond_8

    .line 147
    .line 148
    move-object/from16 v2, p1

    .line 149
    .line 150
    check-cast v2, Lq3/g;

    .line 151
    .line 152
    iget-wide v9, v2, Lq3/g;->c:J

    .line 153
    .line 154
    invoke-static {v6, v7, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 155
    .line 156
    .line 157
    move-result-wide v6

    .line 158
    long-to-int v4, v6

    .line 159
    iget-wide v6, v2, Lq3/g;->d:J

    .line 160
    .line 161
    int-to-long v9, v5

    .line 162
    cmp-long v6, v6, v9

    .line 163
    .line 164
    if-eqz v6, :cond_5

    .line 165
    .line 166
    iput-wide v9, v1, Lc7/j;->a:J

    .line 167
    .line 168
    return v3

    .line 169
    :cond_5
    invoke-virtual {v12, v4}, LA4/r;->E(I)V

    .line 170
    .line 171
    .line 172
    iput v5, v2, Lq3/g;->f:I

    .line 173
    .line 174
    iget-object v1, v12, LA4/r;->c:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v1, [B

    .line 177
    .line 178
    invoke-virtual {v2, v1, v5, v4, v5}, Lq3/g;->t([BIIZ)Z

    .line 179
    .line 180
    .line 181
    iget v1, v12, LA4/r;->a:I

    .line 182
    .line 183
    iget v2, v12, LA4/r;->b:I

    .line 184
    .line 185
    :goto_2
    add-int/lit8 v4, v2, -0x3

    .line 186
    .line 187
    if-ge v1, v4, :cond_7

    .line 188
    .line 189
    iget-object v4, v12, LA4/r;->c:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v4, [B

    .line 192
    .line 193
    invoke-static {v1, v4}, LA3/y;->b(I[B)I

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-ne v4, v11, :cond_6

    .line 198
    .line 199
    add-int/lit8 v4, v1, 0x4

    .line 200
    .line 201
    invoke-virtual {v12, v4}, LA4/r;->H(I)V

    .line 202
    .line 203
    .line 204
    invoke-static {v12}, LA3/y;->c(LA4/r;)J

    .line 205
    .line 206
    .line 207
    move-result-wide v6

    .line 208
    cmp-long v4, v6, v19

    .line 209
    .line 210
    if-eqz v4, :cond_6

    .line 211
    .line 212
    move-wide v9, v6

    .line 213
    goto :goto_3

    .line 214
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_7
    move-wide/from16 v9, v19

    .line 218
    .line 219
    :goto_3
    iput-wide v9, v14, LA3/y;->g:J

    .line 220
    .line 221
    iput-boolean v3, v14, LA3/y;->e:Z

    .line 222
    .line 223
    return v5

    .line 224
    :cond_8
    iget-wide v1, v14, LA3/y;->g:J

    .line 225
    .line 226
    cmp-long v3, v1, v19

    .line 227
    .line 228
    if-nez v3, :cond_9

    .line 229
    .line 230
    move-object/from16 v1, p1

    .line 231
    .line 232
    check-cast v1, Lq3/g;

    .line 233
    .line 234
    invoke-virtual {v14, v1}, LA3/y;->a(Lq3/g;)V

    .line 235
    .line 236
    .line 237
    return v5

    .line 238
    :cond_9
    iget-object v3, v14, LA3/y;->b:Ll4/x;

    .line 239
    .line 240
    invoke-virtual {v3, v1, v2}, Ll4/x;->b(J)J

    .line 241
    .line 242
    .line 243
    move-result-wide v1

    .line 244
    iget-wide v6, v14, LA3/y;->h:J

    .line 245
    .line 246
    invoke-virtual {v3, v6, v7}, Ll4/x;->b(J)J

    .line 247
    .line 248
    .line 249
    move-result-wide v3

    .line 250
    sub-long/2addr v3, v1

    .line 251
    iput-wide v3, v14, LA3/y;->i:J

    .line 252
    .line 253
    cmp-long v1, v3, v15

    .line 254
    .line 255
    if-gez v1, :cond_a

    .line 256
    .line 257
    new-instance v1, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    const-string v2, "Invalid duration: "

    .line 260
    .line 261
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    iget-wide v2, v14, LA3/y;->i:J

    .line 265
    .line 266
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    const-string v2, ". Using TIME_UNSET instead."

    .line 270
    .line 271
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    const-string v2, "PsDurationReader"

    .line 279
    .line 280
    invoke-static {v2, v1}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    move-wide/from16 v1, v19

    .line 284
    .line 285
    iput-wide v1, v14, LA3/y;->i:J

    .line 286
    .line 287
    :cond_a
    move-object/from16 v1, p1

    .line 288
    .line 289
    check-cast v1, Lq3/g;

    .line 290
    .line 291
    invoke-virtual {v14, v1}, LA3/y;->a(Lq3/g;)V

    .line 292
    .line 293
    .line 294
    return v5

    .line 295
    :cond_b
    const-wide/16 v15, 0x0

    .line 296
    .line 297
    iget-boolean v6, v0, LA3/A;->k:Z

    .line 298
    .line 299
    if-nez v6, :cond_d

    .line 300
    .line 301
    iput-boolean v3, v0, LA3/A;->k:Z

    .line 302
    .line 303
    iget-wide v6, v14, LA3/y;->i:J

    .line 304
    .line 305
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    cmp-long v9, v6, v19

    .line 311
    .line 312
    if-eqz v9, :cond_c

    .line 313
    .line 314
    move v9, v3

    .line 315
    new-instance v3, LA3/x;

    .line 316
    .line 317
    move v10, v4

    .line 318
    new-instance v4, Ld0/w;

    .line 319
    .line 320
    const/16 v5, 0xb

    .line 321
    .line 322
    invoke-direct {v4, v5}, Ld0/w;-><init>(I)V

    .line 323
    .line 324
    .line 325
    new-instance v5, LA1/g;

    .line 326
    .line 327
    iget-object v14, v14, LA3/y;->b:Ll4/x;

    .line 328
    .line 329
    invoke-direct {v5, v14}, LA1/g;-><init>(Ll4/x;)V

    .line 330
    .line 331
    .line 332
    const-wide/16 v20, 0x1

    .line 333
    .line 334
    add-long v20, v6, v20

    .line 335
    .line 336
    move-wide v14, v15

    .line 337
    const/16 v16, 0x3e8

    .line 338
    .line 339
    move/from16 v22, v10

    .line 340
    .line 341
    move/from16 v23, v11

    .line 342
    .line 343
    const-wide/16 v10, 0x0

    .line 344
    .line 345
    move-wide/from16 v24, v14

    .line 346
    .line 347
    const-wide/16 v14, 0xbc

    .line 348
    .line 349
    move/from16 v26, v2

    .line 350
    .line 351
    move-wide/from16 v8, v20

    .line 352
    .line 353
    const/4 v2, 0x0

    .line 354
    invoke-direct/range {v3 .. v16}, LA3/x;-><init>(Lq3/c;Lq3/e;JJJJJI)V

    .line 355
    .line 356
    .line 357
    iput-object v3, v0, LA3/A;->i:LA3/x;

    .line 358
    .line 359
    iget-object v4, v0, LA3/A;->j:Lq3/l;

    .line 360
    .line 361
    iget-object v3, v3, LA3/x;->a:Lq3/a;

    .line 362
    .line 363
    invoke-interface {v4, v3}, Lq3/l;->r(Lq3/r;)V

    .line 364
    .line 365
    .line 366
    goto :goto_4

    .line 367
    :cond_c
    move/from16 v26, v2

    .line 368
    .line 369
    move v2, v5

    .line 370
    iget-object v3, v0, LA3/A;->j:Lq3/l;

    .line 371
    .line 372
    new-instance v4, Lq3/m;

    .line 373
    .line 374
    invoke-direct {v4, v6, v7}, Lq3/m;-><init>(J)V

    .line 375
    .line 376
    .line 377
    invoke-interface {v3, v4}, Lq3/l;->r(Lq3/r;)V

    .line 378
    .line 379
    .line 380
    goto :goto_4

    .line 381
    :cond_d
    move/from16 v26, v2

    .line 382
    .line 383
    move v2, v5

    .line 384
    :goto_4
    iget-object v3, v0, LA3/A;->i:LA3/x;

    .line 385
    .line 386
    if-eqz v3, :cond_e

    .line 387
    .line 388
    iget-object v4, v3, LA3/x;->c:Lq3/b;

    .line 389
    .line 390
    if-eqz v4, :cond_e

    .line 391
    .line 392
    move-object/from16 v2, p1

    .line 393
    .line 394
    check-cast v2, Lq3/g;

    .line 395
    .line 396
    invoke-virtual {v3, v2, v1}, LA3/x;->b(Lq3/g;Lc7/j;)I

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    return v1

    .line 401
    :cond_e
    move-object/from16 v1, p1

    .line 402
    .line 403
    check-cast v1, Lq3/g;

    .line 404
    .line 405
    iput v2, v1, Lq3/g;->f:I

    .line 406
    .line 407
    if-eqz v26, :cond_f

    .line 408
    .line 409
    invoke-virtual {v1}, Lq3/g;->w()J

    .line 410
    .line 411
    .line 412
    move-result-wide v3

    .line 413
    sub-long/2addr v12, v3

    .line 414
    goto :goto_5

    .line 415
    :cond_f
    move-wide/from16 v12, v17

    .line 416
    .line 417
    :goto_5
    cmp-long v3, v12, v17

    .line 418
    .line 419
    if-eqz v3, :cond_10

    .line 420
    .line 421
    const-wide/16 v3, 0x4

    .line 422
    .line 423
    cmp-long v3, v12, v3

    .line 424
    .line 425
    if-gez v3, :cond_10

    .line 426
    .line 427
    goto :goto_6

    .line 428
    :cond_10
    iget-object v3, v0, LA3/A;->c:LA4/r;

    .line 429
    .line 430
    iget-object v4, v3, LA4/r;->c:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v4, [B

    .line 433
    .line 434
    const/4 v9, 0x1

    .line 435
    const/4 v10, 0x4

    .line 436
    invoke-virtual {v1, v4, v2, v10, v9}, Lq3/g;->t([BIIZ)Z

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    if-nez v4, :cond_11

    .line 441
    .line 442
    goto :goto_6

    .line 443
    :cond_11
    invoke-virtual {v3, v2}, LA4/r;->H(I)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3}, LA4/r;->i()I

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    const/16 v5, 0x1b9

    .line 451
    .line 452
    if-ne v4, v5, :cond_12

    .line 453
    .line 454
    :goto_6
    const/4 v1, -0x1

    .line 455
    return v1

    .line 456
    :cond_12
    const/16 v5, 0x1ba

    .line 457
    .line 458
    if-ne v4, v5, :cond_13

    .line 459
    .line 460
    iget-object v4, v3, LA4/r;->c:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v4, [B

    .line 463
    .line 464
    const/16 v5, 0xa

    .line 465
    .line 466
    invoke-virtual {v1, v4, v2, v5, v2}, Lq3/g;->t([BIIZ)Z

    .line 467
    .line 468
    .line 469
    const/16 v4, 0x9

    .line 470
    .line 471
    invoke-virtual {v3, v4}, LA4/r;->H(I)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v3}, LA4/r;->x()I

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    and-int/lit8 v3, v3, 0x7

    .line 479
    .line 480
    add-int/lit8 v3, v3, 0xe

    .line 481
    .line 482
    invoke-virtual {v1, v3}, Lq3/g;->n(I)V

    .line 483
    .line 484
    .line 485
    return v2

    .line 486
    :cond_13
    const/16 v5, 0x1bb

    .line 487
    .line 488
    const/4 v6, 0x2

    .line 489
    const/4 v7, 0x6

    .line 490
    if-ne v4, v5, :cond_14

    .line 491
    .line 492
    iget-object v4, v3, LA4/r;->c:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v4, [B

    .line 495
    .line 496
    invoke-virtual {v1, v4, v2, v6, v2}, Lq3/g;->t([BIIZ)Z

    .line 497
    .line 498
    .line 499
    invoke-virtual {v3, v2}, LA4/r;->H(I)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v3}, LA4/r;->C()I

    .line 503
    .line 504
    .line 505
    move-result v3

    .line 506
    add-int/2addr v3, v7

    .line 507
    invoke-virtual {v1, v3}, Lq3/g;->n(I)V

    .line 508
    .line 509
    .line 510
    return v2

    .line 511
    :cond_14
    and-int/lit16 v5, v4, -0x100

    .line 512
    .line 513
    const/16 v8, 0x8

    .line 514
    .line 515
    shr-int/2addr v5, v8

    .line 516
    const/4 v9, 0x1

    .line 517
    if-eq v5, v9, :cond_15

    .line 518
    .line 519
    invoke-virtual {v1, v9}, Lq3/g;->n(I)V

    .line 520
    .line 521
    .line 522
    return v2

    .line 523
    :cond_15
    and-int/lit16 v5, v4, 0xff

    .line 524
    .line 525
    iget-object v9, v0, LA3/A;->b:Landroid/util/SparseArray;

    .line 526
    .line 527
    invoke-virtual {v9, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v11

    .line 531
    check-cast v11, LA3/z;

    .line 532
    .line 533
    iget-boolean v12, v0, LA3/A;->e:Z

    .line 534
    .line 535
    if-nez v12, :cond_1b

    .line 536
    .line 537
    if-nez v11, :cond_19

    .line 538
    .line 539
    const/16 v12, 0xbd

    .line 540
    .line 541
    const/4 v13, 0x0

    .line 542
    if-ne v5, v12, :cond_16

    .line 543
    .line 544
    new-instance v4, LA3/b;

    .line 545
    .line 546
    const/4 v12, 0x0

    .line 547
    invoke-direct {v4, v13, v12}, LA3/b;-><init>(Ljava/lang/String;I)V

    .line 548
    .line 549
    .line 550
    const/4 v12, 0x1

    .line 551
    iput-boolean v12, v0, LA3/A;->f:Z

    .line 552
    .line 553
    iget-wide v12, v1, Lq3/g;->d:J

    .line 554
    .line 555
    iput-wide v12, v0, LA3/A;->h:J

    .line 556
    .line 557
    :goto_7
    move-object v13, v4

    .line 558
    goto :goto_8

    .line 559
    :cond_16
    and-int/lit16 v12, v4, 0xe0

    .line 560
    .line 561
    const/16 v14, 0xc0

    .line 562
    .line 563
    if-ne v12, v14, :cond_17

    .line 564
    .line 565
    new-instance v4, LA3/u;

    .line 566
    .line 567
    invoke-direct {v4, v13}, LA3/u;-><init>(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    const/4 v12, 0x1

    .line 571
    iput-boolean v12, v0, LA3/A;->f:Z

    .line 572
    .line 573
    iget-wide v12, v1, Lq3/g;->d:J

    .line 574
    .line 575
    iput-wide v12, v0, LA3/A;->h:J

    .line 576
    .line 577
    goto :goto_7

    .line 578
    :cond_17
    and-int/lit16 v4, v4, 0xf0

    .line 579
    .line 580
    const/16 v12, 0xe0

    .line 581
    .line 582
    if-ne v4, v12, :cond_18

    .line 583
    .line 584
    new-instance v4, LA3/k;

    .line 585
    .line 586
    invoke-direct {v4, v13}, LA3/k;-><init>(LA3/D;)V

    .line 587
    .line 588
    .line 589
    const/4 v12, 0x1

    .line 590
    iput-boolean v12, v0, LA3/A;->g:Z

    .line 591
    .line 592
    iget-wide v12, v1, Lq3/g;->d:J

    .line 593
    .line 594
    iput-wide v12, v0, LA3/A;->h:J

    .line 595
    .line 596
    goto :goto_7

    .line 597
    :cond_18
    :goto_8
    if-eqz v13, :cond_19

    .line 598
    .line 599
    new-instance v4, LA3/I;

    .line 600
    .line 601
    const/16 v11, 0x100

    .line 602
    .line 603
    invoke-direct {v4, v5, v11}, LA3/I;-><init>(II)V

    .line 604
    .line 605
    .line 606
    iget-object v11, v0, LA3/A;->j:Lq3/l;

    .line 607
    .line 608
    invoke-interface {v13, v11, v4}, LA3/i;->f(Lq3/l;LA3/I;)V

    .line 609
    .line 610
    .line 611
    new-instance v11, LA3/z;

    .line 612
    .line 613
    iget-object v4, v0, LA3/A;->a:Ll4/x;

    .line 614
    .line 615
    invoke-direct {v11, v13, v4}, LA3/z;-><init>(LA3/i;Ll4/x;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v9, v5, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    :cond_19
    iget-boolean v4, v0, LA3/A;->f:Z

    .line 622
    .line 623
    if-eqz v4, :cond_1a

    .line 624
    .line 625
    iget-boolean v4, v0, LA3/A;->g:Z

    .line 626
    .line 627
    if-eqz v4, :cond_1a

    .line 628
    .line 629
    iget-wide v4, v0, LA3/A;->h:J

    .line 630
    .line 631
    const-wide/16 v12, 0x2000

    .line 632
    .line 633
    add-long/2addr v4, v12

    .line 634
    goto :goto_9

    .line 635
    :cond_1a
    const-wide/32 v4, 0x100000

    .line 636
    .line 637
    .line 638
    :goto_9
    iget-wide v12, v1, Lq3/g;->d:J

    .line 639
    .line 640
    cmp-long v4, v12, v4

    .line 641
    .line 642
    if-lez v4, :cond_1b

    .line 643
    .line 644
    const/4 v9, 0x1

    .line 645
    iput-boolean v9, v0, LA3/A;->e:Z

    .line 646
    .line 647
    iget-object v4, v0, LA3/A;->j:Lq3/l;

    .line 648
    .line 649
    invoke-interface {v4}, Lq3/l;->i()V

    .line 650
    .line 651
    .line 652
    :cond_1b
    iget-object v4, v3, LA4/r;->c:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast v4, [B

    .line 655
    .line 656
    invoke-virtual {v1, v4, v2, v6, v2}, Lq3/g;->t([BIIZ)Z

    .line 657
    .line 658
    .line 659
    invoke-virtual {v3, v2}, LA4/r;->H(I)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v3}, LA4/r;->C()I

    .line 663
    .line 664
    .line 665
    move-result v4

    .line 666
    add-int/2addr v4, v7

    .line 667
    if-nez v11, :cond_1c

    .line 668
    .line 669
    invoke-virtual {v1, v4}, Lq3/g;->n(I)V

    .line 670
    .line 671
    .line 672
    return v2

    .line 673
    :cond_1c
    invoke-virtual {v3, v4}, LA4/r;->E(I)V

    .line 674
    .line 675
    .line 676
    iget-object v5, v3, LA4/r;->c:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast v5, [B

    .line 679
    .line 680
    invoke-virtual {v1, v5, v2, v4, v2}, Lq3/g;->e([BIIZ)Z

    .line 681
    .line 682
    .line 683
    invoke-virtual {v3, v7}, LA4/r;->H(I)V

    .line 684
    .line 685
    .line 686
    iget-object v1, v11, LA3/z;->c:LZ3/f;

    .line 687
    .line 688
    iget-object v4, v1, LZ3/f;->b:[B

    .line 689
    .line 690
    const/4 v5, 0x3

    .line 691
    invoke-virtual {v3, v4, v2, v5}, LA4/r;->h([BII)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v1, v2}, LZ3/f;->o(I)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v1, v8}, LZ3/f;->r(I)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v1}, LZ3/f;->h()Z

    .line 701
    .line 702
    .line 703
    move-result v4

    .line 704
    iput-boolean v4, v11, LA3/z;->d:Z

    .line 705
    .line 706
    invoke-virtual {v1}, LZ3/f;->h()Z

    .line 707
    .line 708
    .line 709
    move-result v4

    .line 710
    iput-boolean v4, v11, LA3/z;->e:Z

    .line 711
    .line 712
    invoke-virtual {v1, v7}, LZ3/f;->r(I)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v1, v8}, LZ3/f;->i(I)I

    .line 716
    .line 717
    .line 718
    move-result v4

    .line 719
    iget-object v6, v1, LZ3/f;->b:[B

    .line 720
    .line 721
    invoke-virtual {v3, v6, v2, v4}, LA4/r;->h([BII)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v1, v2}, LZ3/f;->o(I)V

    .line 725
    .line 726
    .line 727
    const-wide/16 v14, 0x0

    .line 728
    .line 729
    iput-wide v14, v11, LA3/z;->g:J

    .line 730
    .line 731
    iget-boolean v4, v11, LA3/z;->d:Z

    .line 732
    .line 733
    if-eqz v4, :cond_1e

    .line 734
    .line 735
    invoke-virtual {v1, v10}, LZ3/f;->r(I)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v1, v5}, LZ3/f;->i(I)I

    .line 739
    .line 740
    .line 741
    move-result v4

    .line 742
    int-to-long v6, v4

    .line 743
    const/16 v4, 0x1e

    .line 744
    .line 745
    shl-long/2addr v6, v4

    .line 746
    const/4 v9, 0x1

    .line 747
    invoke-virtual {v1, v9}, LZ3/f;->r(I)V

    .line 748
    .line 749
    .line 750
    const/16 v8, 0xf

    .line 751
    .line 752
    invoke-virtual {v1, v8}, LZ3/f;->i(I)I

    .line 753
    .line 754
    .line 755
    move-result v12

    .line 756
    shl-int/2addr v12, v8

    .line 757
    int-to-long v12, v12

    .line 758
    or-long/2addr v6, v12

    .line 759
    invoke-virtual {v1, v9}, LZ3/f;->r(I)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v1, v8}, LZ3/f;->i(I)I

    .line 763
    .line 764
    .line 765
    move-result v12

    .line 766
    int-to-long v12, v12

    .line 767
    or-long/2addr v6, v12

    .line 768
    invoke-virtual {v1, v9}, LZ3/f;->r(I)V

    .line 769
    .line 770
    .line 771
    iget-boolean v12, v11, LA3/z;->f:Z

    .line 772
    .line 773
    iget-object v13, v11, LA3/z;->b:Ll4/x;

    .line 774
    .line 775
    if-nez v12, :cond_1d

    .line 776
    .line 777
    iget-boolean v12, v11, LA3/z;->e:Z

    .line 778
    .line 779
    if-eqz v12, :cond_1d

    .line 780
    .line 781
    invoke-virtual {v1, v10}, LZ3/f;->r(I)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v1, v5}, LZ3/f;->i(I)I

    .line 785
    .line 786
    .line 787
    move-result v5

    .line 788
    int-to-long v14, v5

    .line 789
    shl-long v4, v14, v4

    .line 790
    .line 791
    invoke-virtual {v1, v9}, LZ3/f;->r(I)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v1, v8}, LZ3/f;->i(I)I

    .line 795
    .line 796
    .line 797
    move-result v12

    .line 798
    shl-int/2addr v12, v8

    .line 799
    int-to-long v14, v12

    .line 800
    or-long/2addr v4, v14

    .line 801
    invoke-virtual {v1, v9}, LZ3/f;->r(I)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v1, v8}, LZ3/f;->i(I)I

    .line 805
    .line 806
    .line 807
    move-result v8

    .line 808
    int-to-long v14, v8

    .line 809
    or-long/2addr v4, v14

    .line 810
    invoke-virtual {v1, v9}, LZ3/f;->r(I)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v13, v4, v5}, Ll4/x;->b(J)J

    .line 814
    .line 815
    .line 816
    iput-boolean v9, v11, LA3/z;->f:Z

    .line 817
    .line 818
    :cond_1d
    invoke-virtual {v13, v6, v7}, Ll4/x;->b(J)J

    .line 819
    .line 820
    .line 821
    move-result-wide v4

    .line 822
    iput-wide v4, v11, LA3/z;->g:J

    .line 823
    .line 824
    :cond_1e
    iget-wide v4, v11, LA3/z;->g:J

    .line 825
    .line 826
    iget-object v1, v11, LA3/z;->a:LA3/i;

    .line 827
    .line 828
    invoke-interface {v1, v4, v5, v10}, LA3/i;->e(JI)V

    .line 829
    .line 830
    .line 831
    invoke-interface {v1, v3}, LA3/i;->c(LA4/r;)V

    .line 832
    .line 833
    .line 834
    invoke-interface {v1}, LA3/i;->d()V

    .line 835
    .line 836
    .line 837
    iget-object v1, v3, LA4/r;->c:Ljava/lang/Object;

    .line 838
    .line 839
    check-cast v1, [B

    .line 840
    .line 841
    array-length v1, v1

    .line 842
    invoke-virtual {v3, v1}, LA4/r;->G(I)V

    .line 843
    .line 844
    .line 845
    return v2
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
.end method

.method public final i(Lq3/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA3/A;->j:Lq3/l;

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
.end method

.method public final j(Lq3/k;)Z
    .locals 9

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    check-cast p1, Lq3/g;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1, v1, v2, v0, v2}, Lq3/g;->t([BIIZ)Z

    .line 9
    .line 10
    .line 11
    aget-byte v0, v1, v2

    .line 12
    .line 13
    and-int/lit16 v0, v0, 0xff

    .line 14
    .line 15
    shl-int/lit8 v0, v0, 0x18

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    aget-byte v4, v1, v3

    .line 19
    .line 20
    and-int/lit16 v4, v4, 0xff

    .line 21
    .line 22
    shl-int/lit8 v4, v4, 0x10

    .line 23
    .line 24
    or-int/2addr v0, v4

    .line 25
    const/4 v4, 0x2

    .line 26
    aget-byte v5, v1, v4

    .line 27
    .line 28
    and-int/lit16 v5, v5, 0xff

    .line 29
    .line 30
    const/16 v6, 0x8

    .line 31
    .line 32
    shl-int/2addr v5, v6

    .line 33
    or-int/2addr v0, v5

    .line 34
    const/4 v5, 0x3

    .line 35
    aget-byte v7, v1, v5

    .line 36
    .line 37
    and-int/lit16 v7, v7, 0xff

    .line 38
    .line 39
    or-int/2addr v0, v7

    .line 40
    const/16 v7, 0x1ba

    .line 41
    .line 42
    if-eq v7, v0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v0, 0x4

    .line 46
    aget-byte v7, v1, v0

    .line 47
    .line 48
    and-int/lit16 v7, v7, 0xc4

    .line 49
    .line 50
    const/16 v8, 0x44

    .line 51
    .line 52
    if-eq v7, v8, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/4 v7, 0x6

    .line 56
    aget-byte v7, v1, v7

    .line 57
    .line 58
    and-int/2addr v7, v0

    .line 59
    if-eq v7, v0, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    aget-byte v7, v1, v6

    .line 63
    .line 64
    and-int/2addr v7, v0

    .line 65
    if-eq v7, v0, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const/16 v0, 0x9

    .line 69
    .line 70
    aget-byte v0, v1, v0

    .line 71
    .line 72
    and-int/2addr v0, v3

    .line 73
    if-eq v0, v3, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    const/16 v0, 0xc

    .line 77
    .line 78
    aget-byte v0, v1, v0

    .line 79
    .line 80
    and-int/2addr v0, v5

    .line 81
    if-eq v0, v5, :cond_5

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    const/16 v0, 0xd

    .line 85
    .line 86
    aget-byte v0, v1, v0

    .line 87
    .line 88
    and-int/lit8 v0, v0, 0x7

    .line 89
    .line 90
    invoke-virtual {p1, v0, v2}, Lq3/g;->c(IZ)Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v1, v2, v5, v2}, Lq3/g;->t([BIIZ)Z

    .line 94
    .line 95
    .line 96
    aget-byte p1, v1, v2

    .line 97
    .line 98
    and-int/lit16 p1, p1, 0xff

    .line 99
    .line 100
    shl-int/lit8 p1, p1, 0x10

    .line 101
    .line 102
    aget-byte v0, v1, v3

    .line 103
    .line 104
    and-int/lit16 v0, v0, 0xff

    .line 105
    .line 106
    shl-int/2addr v0, v6

    .line 107
    or-int/2addr p1, v0

    .line 108
    aget-byte v0, v1, v4

    .line 109
    .line 110
    and-int/lit16 v0, v0, 0xff

    .line 111
    .line 112
    or-int/2addr p1, v0

    .line 113
    if-ne v3, p1, :cond_6

    .line 114
    .line 115
    return v3

    .line 116
    :cond_6
    :goto_0
    return v2
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
.end method

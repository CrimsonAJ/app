.class public final LJ1/r0;
.super LJ1/q0;
.source "SourceFile"


# static fields
.field public static final G:Landroid/support/v4/media/session/y;

.field public static final H:Landroid/util/SparseIntArray;


# instance fields
.field public F:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroid/support/v4/media/session/y;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/support/v4/media/session/y;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LJ1/r0;->G:Landroid/support/v4/media/session/y;

    .line 9
    .line 10
    const-string v1, "layout_loading"

    .line 11
    .line 12
    filled-new-array {v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x2

    .line 17
    filled-new-array {v2}, [I

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const v3, 0x7f0d0087

    .line 22
    .line 23
    .line 24
    filled-new-array {v3}, [I

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/4 v4, 0x1

    .line 29
    invoke-virtual {v0, v4, v2, v3, v1}, Landroid/support/v4/media/session/y;->X(I[I[I[Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Landroid/util/SparseIntArray;

    .line 33
    .line 34
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, LJ1/r0;->H:Landroid/util/SparseIntArray;

    .line 38
    .line 39
    const v1, 0x7f0a0071

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x3

    .line 43
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 44
    .line 45
    .line 46
    const v1, 0x7f0a01c1

    .line 47
    .line 48
    .line 49
    const/4 v2, 0x4

    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 51
    .line 52
    .line 53
    const v1, 0x7f0a03a1

    .line 54
    .line 55
    .line 56
    const/4 v2, 0x5

    .line 57
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 58
    .line 59
    .line 60
    const v1, 0x7f0a01f9

    .line 61
    .line 62
    .line 63
    const/4 v2, 0x6

    .line 64
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 65
    .line 66
    .line 67
    const v1, 0x7f0a0121

    .line 68
    .line 69
    .line 70
    const/4 v2, 0x7

    .line 71
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 72
    .line 73
    .line 74
    const v1, 0x7f0a0203

    .line 75
    .line 76
    .line 77
    const/16 v2, 0x8

    .line 78
    .line 79
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 80
    .line 81
    .line 82
    const v1, 0x7f0a0122

    .line 83
    .line 84
    .line 85
    const/16 v2, 0x9

    .line 86
    .line 87
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 88
    .line 89
    .line 90
    const v1, 0x7f0a03b5

    .line 91
    .line 92
    .line 93
    const/16 v2, 0xa

    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 96
    .line 97
    .line 98
    const v1, 0x7f0a0124

    .line 99
    .line 100
    .line 101
    const/16 v2, 0xb

    .line 102
    .line 103
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 104
    .line 105
    .line 106
    const v1, 0x7f0a03b6

    .line 107
    .line 108
    .line 109
    const/16 v2, 0xc

    .line 110
    .line 111
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 112
    .line 113
    .line 114
    const v1, 0x7f0a0126

    .line 115
    .line 116
    .line 117
    const/16 v2, 0xd

    .line 118
    .line 119
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 120
    .line 121
    .line 122
    const v1, 0x7f0a043b

    .line 123
    .line 124
    .line 125
    const/16 v2, 0xe

    .line 126
    .line 127
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 128
    .line 129
    .line 130
    const v1, 0x7f0a00a9

    .line 131
    .line 132
    .line 133
    const/16 v2, 0xf

    .line 134
    .line 135
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 136
    .line 137
    .line 138
    const v1, 0x7f0a03c5

    .line 139
    .line 140
    .line 141
    const/16 v2, 0x10

    .line 142
    .line 143
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 144
    .line 145
    .line 146
    const v1, 0x7f0a03d7

    .line 147
    .line 148
    .line 149
    const/16 v2, 0x11

    .line 150
    .line 151
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 152
    .line 153
    .line 154
    const v1, 0x7f0a007b

    .line 155
    .line 156
    .line 157
    const/16 v2, 0x12

    .line 158
    .line 159
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 160
    .line 161
    .line 162
    return-void
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
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
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

.method public constructor <init>(Landroid/view/View;)V
    .locals 14

    .line 1
    sget-object v0, LJ1/r0;->G:Landroid/support/v4/media/session/y;

    .line 2
    .line 3
    sget-object v1, LJ1/r0;->H:Landroid/util/SparseIntArray;

    .line 4
    .line 5
    const/16 v2, 0x13

    .line 6
    .line 7
    invoke-static {p1, v2, v0, v1}, LW/g;->g0(Landroid/view/View;ILandroid/support/v4/media/session/y;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v13

    .line 11
    const/4 v0, 0x3

    .line 12
    aget-object v0, v13, v0

    .line 13
    .line 14
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 15
    .line 16
    const/16 v1, 0x12

    .line 17
    .line 18
    aget-object v1, v13, v1

    .line 19
    .line 20
    move-object v4, v1

    .line 21
    check-cast v4, Lcom/google/android/material/button/MaterialButton;

    .line 22
    .line 23
    const/16 v1, 0xf

    .line 24
    .line 25
    aget-object v1, v13, v1

    .line 26
    .line 27
    move-object v5, v1

    .line 28
    check-cast v5, Lcom/google/android/material/button/MaterialButton;

    .line 29
    .line 30
    const/4 v1, 0x7

    .line 31
    aget-object v1, v13, v1

    .line 32
    .line 33
    move-object v6, v1

    .line 34
    check-cast v6, Lcom/google/android/material/textfield/TextInputEditText;

    .line 35
    .line 36
    const/16 v1, 0x9

    .line 37
    .line 38
    aget-object v1, v13, v1

    .line 39
    .line 40
    move-object v7, v1

    .line 41
    check-cast v7, Lcom/google/android/material/textfield/TextInputEditText;

    .line 42
    .line 43
    const/16 v1, 0xb

    .line 44
    .line 45
    aget-object v1, v13, v1

    .line 46
    .line 47
    move-object v8, v1

    .line 48
    check-cast v8, Lcom/google/android/material/textfield/TextInputEditText;

    .line 49
    .line 50
    const/16 v1, 0xd

    .line 51
    .line 52
    aget-object v1, v13, v1

    .line 53
    .line 54
    move-object v9, v1

    .line 55
    check-cast v9, Lcom/google/android/material/textfield/TextInputEditText;

    .line 56
    .line 57
    const/4 v1, 0x4

    .line 58
    aget-object v1, v13, v1

    .line 59
    .line 60
    check-cast v1, Landroidx/appcompat/widget/AppCompatImageView;

    .line 61
    .line 62
    const/4 v1, 0x6

    .line 63
    aget-object v1, v13, v1

    .line 64
    .line 65
    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    .line 66
    .line 67
    const/16 v1, 0x8

    .line 68
    .line 69
    aget-object v1, v13, v1

    .line 70
    .line 71
    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    .line 72
    .line 73
    const/4 v1, 0x2

    .line 74
    aget-object v1, v13, v1

    .line 75
    .line 76
    move-object v10, v1

    .line 77
    check-cast v10, LJ1/E1;

    .line 78
    .line 79
    const/4 v1, 0x5

    .line 80
    aget-object v1, v13, v1

    .line 81
    .line 82
    check-cast v1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 83
    .line 84
    const/16 v1, 0xa

    .line 85
    .line 86
    aget-object v1, v13, v1

    .line 87
    .line 88
    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    .line 89
    .line 90
    const/16 v1, 0xc

    .line 91
    .line 92
    aget-object v1, v13, v1

    .line 93
    .line 94
    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    .line 95
    .line 96
    const/16 v1, 0x10

    .line 97
    .line 98
    aget-object v1, v13, v1

    .line 99
    .line 100
    check-cast v1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 101
    .line 102
    const/16 v1, 0x11

    .line 103
    .line 104
    aget-object v1, v13, v1

    .line 105
    .line 106
    move-object v11, v1

    .line 107
    check-cast v11, Landroidx/appcompat/widget/AppCompatTextView;

    .line 108
    .line 109
    const/16 v1, 0xe

    .line 110
    .line 111
    aget-object v1, v13, v1

    .line 112
    .line 113
    move-object v12, v1

    .line 114
    check-cast v12, Landroid/view/View;

    .line 115
    .line 116
    const/4 v1, 0x0

    .line 117
    move-object v2, p1

    .line 118
    move-object v3, v0

    .line 119
    move-object v0, p0

    .line 120
    invoke-direct/range {v0 .. v12}, LJ1/q0;-><init>(LW/b;Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;LJ1/E1;Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;)V

    .line 121
    .line 122
    .line 123
    const-wide/16 v1, -0x1

    .line 124
    .line 125
    iput-wide v1, p0, LJ1/r0;->F:J

    .line 126
    .line 127
    iget-object v1, p0, LJ1/q0;->C:LJ1/E1;

    .line 128
    .line 129
    if-eqz v1, :cond_0

    .line 130
    .line 131
    iput-object p0, v1, LW/g;->p:LW/g;

    .line 132
    .line 133
    :cond_0
    const/4 v1, 0x0

    .line 134
    aget-object v1, v13, v1

    .line 135
    .line 136
    check-cast v1, Landroid/widget/ScrollView;

    .line 137
    .line 138
    const/4 v2, 0x0

    .line 139
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    const/4 v1, 0x1

    .line 143
    aget-object v1, v13, v1

    .line 144
    .line 145
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 146
    .line 147
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {p0 .. p1}, LW/g;->j0(Landroid/view/View;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, LJ1/r0;->e0()V

    .line 154
    .line 155
    .line 156
    return-void
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


# virtual methods
.method public final a0()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, LJ1/r0;->F:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, LJ1/q0;->C:LJ1/E1;

    .line 8
    .line 9
    invoke-virtual {v0}, LW/g;->b0()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v0
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

.method public final d0()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, LJ1/r0;->F:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    iget-object v0, p0, LJ1/q0;->C:LJ1/E1;

    .line 17
    .line 18
    invoke-virtual {v0}, LW/g;->d0()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return v0

    .line 27
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final e0()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x2

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, LJ1/r0;->F:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, LJ1/q0;->C:LJ1/E1;

    .line 8
    .line 9
    invoke-virtual {v0}, LW/g;->e0()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, LW/g;->h0()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
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

.method public final i0(Landroidx/lifecycle/w;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, LW/g;->i0(Landroidx/lifecycle/w;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LJ1/q0;->C:LJ1/E1;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, LW/g;->i0(Landroidx/lifecycle/w;)V

    .line 7
    .line 8
    .line 9
    return-void
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

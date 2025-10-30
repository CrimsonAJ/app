.class public final Le1/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Ljava/util/UUID;

.field public c:Ln1/j;

.field public final d:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Le1/r;->a:Z

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Le1/r;->d:Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, Le1/r;->b:Ljava/util/UUID;

    .line 19
    .line 20
    new-instance v1, Ln1/j;

    .line 21
    .line 22
    iget-object v2, p0, Le1/r;->b:Ljava/util/UUID;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {v1, v2, v3}, Ln1/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Le1/r;->c:Ln1/j;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Le1/r;->c:Ln1/j;

    .line 45
    .line 46
    const-class v0, Landroidx/work/OverwritingInputMerger;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p1, Ln1/j;->d:Ljava/lang/String;

    .line 53
    .line 54
    return-void
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
.method public final a()Le1/s;
    .locals 9

    .line 1
    iget-boolean v0, p0, Le1/r;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Le1/r;->c:Ln1/j;

    .line 6
    .line 7
    iget-object v0, v0, Ln1/j;->j:Le1/c;

    .line 8
    .line 9
    iget-boolean v0, v0, Le1/c;->c:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v1, "Cannot set backoff criteria on an idle mode job"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :cond_1
    :goto_0
    new-instance v0, Le1/s;

    .line 23
    .line 24
    iget-object v1, p0, Le1/r;->b:Ljava/util/UUID;

    .line 25
    .line 26
    iget-object v2, p0, Le1/r;->c:Ln1/j;

    .line 27
    .line 28
    iget-object v3, p0, Le1/r;->d:Ljava/util/HashSet;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, v0, Le1/s;->a:Ljava/util/UUID;

    .line 34
    .line 35
    iput-object v2, v0, Le1/s;->b:Ln1/j;

    .line 36
    .line 37
    iput-object v3, v0, Le1/s;->c:Ljava/util/HashSet;

    .line 38
    .line 39
    iget-object v1, v2, Ln1/j;->j:Le1/c;

    .line 40
    .line 41
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 42
    .line 43
    const/16 v3, 0x18

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    if-lt v2, v3, :cond_2

    .line 47
    .line 48
    iget-object v2, v1, Le1/c;->h:Le1/e;

    .line 49
    .line 50
    iget-object v2, v2, Le1/e;->a:Ljava/util/HashSet;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-lez v2, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iget-boolean v2, v1, Le1/c;->d:Z

    .line 60
    .line 61
    if-nez v2, :cond_4

    .line 62
    .line 63
    iget-boolean v2, v1, Le1/c;->b:Z

    .line 64
    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    iget-boolean v1, v1, Le1/c;->c:Z

    .line 68
    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const/4 v1, 0x0

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    :goto_1
    move v1, v4

    .line 75
    :goto_2
    iget-object v2, p0, Le1/r;->c:Ln1/j;

    .line 76
    .line 77
    iget-boolean v3, v2, Ln1/j;->q:Z

    .line 78
    .line 79
    if-eqz v3, :cond_7

    .line 80
    .line 81
    if-nez v1, :cond_6

    .line 82
    .line 83
    iget-wide v1, v2, Ln1/j;->g:J

    .line 84
    .line 85
    const-wide/16 v5, 0x0

    .line 86
    .line 87
    cmp-long v1, v1, v5

    .line 88
    .line 89
    if-gtz v1, :cond_5

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 93
    .line 94
    const-string v1, "Expedited jobs cannot be delayed"

    .line 95
    .line 96
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 101
    .line 102
    const-string v1, "Expedited jobs only support network and storage constraints"

    .line 103
    .line 104
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v0

    .line 108
    :cond_7
    :goto_3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iput-object v1, p0, Le1/r;->b:Ljava/util/UUID;

    .line 113
    .line 114
    new-instance v1, Ln1/j;

    .line 115
    .line 116
    iget-object v2, p0, Le1/r;->c:Ln1/j;

    .line 117
    .line 118
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    iput v4, v1, Ln1/j;->b:I

    .line 122
    .line 123
    sget-object v3, Le1/h;->c:Le1/h;

    .line 124
    .line 125
    iput-object v3, v1, Ln1/j;->e:Le1/h;

    .line 126
    .line 127
    iput-object v3, v1, Ln1/j;->f:Le1/h;

    .line 128
    .line 129
    sget-object v3, Le1/c;->i:Le1/c;

    .line 130
    .line 131
    iput-object v3, v1, Ln1/j;->j:Le1/c;

    .line 132
    .line 133
    iput v4, v1, Ln1/j;->l:I

    .line 134
    .line 135
    const-wide/16 v5, 0x7530

    .line 136
    .line 137
    iput-wide v5, v1, Ln1/j;->m:J

    .line 138
    .line 139
    const-wide/16 v5, -0x1

    .line 140
    .line 141
    iput-wide v5, v1, Ln1/j;->p:J

    .line 142
    .line 143
    iput v4, v1, Ln1/j;->r:I

    .line 144
    .line 145
    iget-object v3, v2, Ln1/j;->a:Ljava/lang/String;

    .line 146
    .line 147
    iput-object v3, v1, Ln1/j;->a:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v3, v2, Ln1/j;->c:Ljava/lang/String;

    .line 150
    .line 151
    iput-object v3, v1, Ln1/j;->c:Ljava/lang/String;

    .line 152
    .line 153
    iget v3, v2, Ln1/j;->b:I

    .line 154
    .line 155
    iput v3, v1, Ln1/j;->b:I

    .line 156
    .line 157
    iget-object v3, v2, Ln1/j;->d:Ljava/lang/String;

    .line 158
    .line 159
    iput-object v3, v1, Ln1/j;->d:Ljava/lang/String;

    .line 160
    .line 161
    new-instance v3, Le1/h;

    .line 162
    .line 163
    iget-object v7, v2, Ln1/j;->e:Le1/h;

    .line 164
    .line 165
    invoke-direct {v3, v7}, Le1/h;-><init>(Le1/h;)V

    .line 166
    .line 167
    .line 168
    iput-object v3, v1, Ln1/j;->e:Le1/h;

    .line 169
    .line 170
    new-instance v3, Le1/h;

    .line 171
    .line 172
    iget-object v7, v2, Ln1/j;->f:Le1/h;

    .line 173
    .line 174
    invoke-direct {v3, v7}, Le1/h;-><init>(Le1/h;)V

    .line 175
    .line 176
    .line 177
    iput-object v3, v1, Ln1/j;->f:Le1/h;

    .line 178
    .line 179
    iget-wide v7, v2, Ln1/j;->g:J

    .line 180
    .line 181
    iput-wide v7, v1, Ln1/j;->g:J

    .line 182
    .line 183
    iget-wide v7, v2, Ln1/j;->h:J

    .line 184
    .line 185
    iput-wide v7, v1, Ln1/j;->h:J

    .line 186
    .line 187
    iget-wide v7, v2, Ln1/j;->i:J

    .line 188
    .line 189
    iput-wide v7, v1, Ln1/j;->i:J

    .line 190
    .line 191
    new-instance v3, Le1/c;

    .line 192
    .line 193
    iget-object v7, v2, Ln1/j;->j:Le1/c;

    .line 194
    .line 195
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 196
    .line 197
    .line 198
    iput v4, v3, Le1/c;->a:I

    .line 199
    .line 200
    iput-wide v5, v3, Le1/c;->f:J

    .line 201
    .line 202
    iput-wide v5, v3, Le1/c;->g:J

    .line 203
    .line 204
    new-instance v4, Le1/e;

    .line 205
    .line 206
    invoke-direct {v4}, Le1/e;-><init>()V

    .line 207
    .line 208
    .line 209
    iput-object v4, v3, Le1/c;->h:Le1/e;

    .line 210
    .line 211
    iget-boolean v4, v7, Le1/c;->b:Z

    .line 212
    .line 213
    iput-boolean v4, v3, Le1/c;->b:Z

    .line 214
    .line 215
    iget-boolean v4, v7, Le1/c;->c:Z

    .line 216
    .line 217
    iput-boolean v4, v3, Le1/c;->c:Z

    .line 218
    .line 219
    iget v4, v7, Le1/c;->a:I

    .line 220
    .line 221
    iput v4, v3, Le1/c;->a:I

    .line 222
    .line 223
    iget-boolean v4, v7, Le1/c;->d:Z

    .line 224
    .line 225
    iput-boolean v4, v3, Le1/c;->d:Z

    .line 226
    .line 227
    iget-boolean v4, v7, Le1/c;->e:Z

    .line 228
    .line 229
    iput-boolean v4, v3, Le1/c;->e:Z

    .line 230
    .line 231
    iget-object v4, v7, Le1/c;->h:Le1/e;

    .line 232
    .line 233
    iput-object v4, v3, Le1/c;->h:Le1/e;

    .line 234
    .line 235
    iput-object v3, v1, Ln1/j;->j:Le1/c;

    .line 236
    .line 237
    iget v3, v2, Ln1/j;->k:I

    .line 238
    .line 239
    iput v3, v1, Ln1/j;->k:I

    .line 240
    .line 241
    iget v3, v2, Ln1/j;->l:I

    .line 242
    .line 243
    iput v3, v1, Ln1/j;->l:I

    .line 244
    .line 245
    iget-wide v3, v2, Ln1/j;->m:J

    .line 246
    .line 247
    iput-wide v3, v1, Ln1/j;->m:J

    .line 248
    .line 249
    iget-wide v3, v2, Ln1/j;->n:J

    .line 250
    .line 251
    iput-wide v3, v1, Ln1/j;->n:J

    .line 252
    .line 253
    iget-wide v3, v2, Ln1/j;->o:J

    .line 254
    .line 255
    iput-wide v3, v1, Ln1/j;->o:J

    .line 256
    .line 257
    iget-wide v3, v2, Ln1/j;->p:J

    .line 258
    .line 259
    iput-wide v3, v1, Ln1/j;->p:J

    .line 260
    .line 261
    iget-boolean v3, v2, Ln1/j;->q:Z

    .line 262
    .line 263
    iput-boolean v3, v1, Ln1/j;->q:Z

    .line 264
    .line 265
    iget v2, v2, Ln1/j;->r:I

    .line 266
    .line 267
    iput v2, v1, Ln1/j;->r:I

    .line 268
    .line 269
    iput-object v1, p0, Le1/r;->c:Ln1/j;

    .line 270
    .line 271
    iget-object v2, p0, Le1/r;->b:Ljava/util/UUID;

    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    iput-object v2, v1, Ln1/j;->a:Ljava/lang/String;

    .line 278
    .line 279
    return-object v0
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

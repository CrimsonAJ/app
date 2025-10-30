.class public final Lu4/c;
.super LG4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu4/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final s:Lu4/A;

.field public static final t:Lu4/B;

.field public static final u:Lv4/a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/ArrayList;

.field public final c:Z

.field public final d:Lt4/i;

.field public final e:Z

.field public final f:Lv4/a;

.field public final g:Z

.field public final h:D

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Ljava/util/ArrayList;

.field public final m:Z

.field public final n:Z

.field public final o:Lu4/A;

.field public p:Lu4/B;

.field public final q:Z

.field public final r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 45

    .line 1
    new-instance v0, Lu4/A;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lu4/A;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lu4/c;->s:Lu4/A;

    .line 8
    .line 9
    new-instance v0, Lu4/B;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lu4/B;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lu4/c;->t:Lu4/B;

    .line 15
    .line 16
    sget-object v3, Lv4/f;->g0:Lcom/google/android/gms/internal/cast/g0;

    .line 17
    .line 18
    sget-object v4, Lv4/f;->h0:[I

    .line 19
    .line 20
    const-string v0, "smallIconDrawableResId"

    .line 21
    .line 22
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    const-string v0, "stopLiveStreamDrawableResId"

    .line 27
    .line 28
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    const-string v0, "pauseDrawableResId"

    .line 33
    .line 34
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    const-string v0, "playDrawableResId"

    .line 39
    .line 40
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v11

    .line 44
    const-string v0, "skipNextDrawableResId"

    .line 45
    .line 46
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v12

    .line 50
    const-string v0, "skipPrevDrawableResId"

    .line 51
    .line 52
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v13

    .line 56
    const-string v0, "forwardDrawableResId"

    .line 57
    .line 58
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v14

    .line 62
    const-string v0, "forward10DrawableResId"

    .line 63
    .line 64
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v15

    .line 68
    const-string v0, "forward30DrawableResId"

    .line 69
    .line 70
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v16

    .line 74
    const-string v0, "rewindDrawableResId"

    .line 75
    .line 76
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v17

    .line 80
    const-string v0, "rewind10DrawableResId"

    .line 81
    .line 82
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v18

    .line 86
    const-string v0, "rewind30DrawableResId"

    .line 87
    .line 88
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v19

    .line 92
    const-string v0, "disconnectDrawableResId"

    .line 93
    .line 94
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v20

    .line 98
    new-instance v2, Lv4/f;

    .line 99
    .line 100
    const-string v0, "notificationImageSizeDimenResId"

    .line 101
    .line 102
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v21

    .line 106
    const-string v0, "castingToDeviceStringResId"

    .line 107
    .line 108
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v22

    .line 112
    const-string v0, "stopLiveStreamStringResId"

    .line 113
    .line 114
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v23

    .line 118
    const-string v0, "pauseStringResId"

    .line 119
    .line 120
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v24

    .line 124
    const-string v0, "playStringResId"

    .line 125
    .line 126
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v25

    .line 130
    const-string v0, "skipNextStringResId"

    .line 131
    .line 132
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v26

    .line 136
    const-string v0, "skipPrevStringResId"

    .line 137
    .line 138
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v27

    .line 142
    const-string v0, "forwardStringResId"

    .line 143
    .line 144
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v28

    .line 148
    const-string v0, "forward10StringResId"

    .line 149
    .line 150
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v29

    .line 154
    const-string v0, "forward30StringResId"

    .line 155
    .line 156
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v30

    .line 160
    const-string v0, "rewindStringResId"

    .line 161
    .line 162
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    move-result v31

    .line 166
    const-string v0, "rewind10StringResId"

    .line 167
    .line 168
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result v32

    .line 172
    const-string v0, "rewind30StringResId"

    .line 173
    .line 174
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    move-result v33

    .line 178
    const-string v0, "disconnectStringResId"

    .line 179
    .line 180
    invoke-static {v0}, La/a;->B(Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v34

    .line 184
    const/4 v7, 0x0

    .line 185
    const/16 v35, 0x0

    .line 186
    .line 187
    const-wide/16 v5, 0x2710

    .line 188
    .line 189
    const/16 v36, 0x0

    .line 190
    .line 191
    const/16 v37, 0x0

    .line 192
    .line 193
    invoke-direct/range {v2 .. v37}, Lv4/f;-><init>(Ljava/util/List;[IJLjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIIILandroid/os/IBinder;ZZ)V

    .line 194
    .line 195
    .line 196
    new-instance v38, Lv4/a;

    .line 197
    .line 198
    const/16 v43, 0x0

    .line 199
    .line 200
    const/16 v44, 0x0

    .line 201
    .line 202
    const-string v39, "com.google.android.gms.cast.framework.media.MediaIntentReceiver"

    .line 203
    .line 204
    const/16 v40, 0x0

    .line 205
    .line 206
    const/16 v41, 0x0

    .line 207
    .line 208
    const/16 v42, 0x0

    .line 209
    .line 210
    invoke-direct/range {v38 .. v44}, Lv4/a;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/IBinder;Lv4/f;ZZ)V

    .line 211
    .line 212
    .line 213
    sput-object v38, Lu4/c;->u:Lv4/a;

    .line 214
    .line 215
    new-instance v0, Lt4/B;

    .line 216
    .line 217
    const/4 v1, 0x4

    .line 218
    invoke-direct {v0, v1}, Lt4/B;-><init>(I)V

    .line 219
    .line 220
    .line 221
    sput-object v0, Lu4/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 222
    .line 223
    return-void
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

.method public constructor <init>(Ljava/lang/String;Ljava/util/ArrayList;ZLt4/i;ZLv4/a;ZDZZZLjava/util/ArrayList;ZZLu4/A;Lu4/B;ZZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-ne v0, v1, :cond_0

    const-string p1, ""

    :cond_0
    iput-object p1, p0, Lu4/c;->a:Ljava/lang/String;

    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    .line 3
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    .line 4
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lu4/c;->b:Ljava/util/ArrayList;

    if-lez p1, :cond_2

    .line 6
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_2
    iput-boolean p3, p0, Lu4/c;->c:Z

    if-nez p4, :cond_3

    .line 7
    new-instance p4, Lt4/i;

    invoke-direct {p4}, Lt4/i;-><init>()V

    :cond_3
    iput-object p4, p0, Lu4/c;->d:Lt4/i;

    iput-boolean p5, p0, Lu4/c;->e:Z

    iput-object p6, p0, Lu4/c;->f:Lv4/a;

    iput-boolean p7, p0, Lu4/c;->g:Z

    iput-wide p8, p0, Lu4/c;->h:D

    iput-boolean p10, p0, Lu4/c;->i:Z

    iput-boolean p11, p0, Lu4/c;->j:Z

    iput-boolean p12, p0, Lu4/c;->k:Z

    iput-object p13, p0, Lu4/c;->l:Ljava/util/ArrayList;

    move/from16 p1, p14

    iput-boolean p1, p0, Lu4/c;->m:Z

    move/from16 p1, p15

    iput-boolean p1, p0, Lu4/c;->n:Z

    move-object/from16 p1, p16

    iput-object p1, p0, Lu4/c;->o:Lu4/A;

    move-object/from16 p1, p17

    iput-object p1, p0, Lu4/c;->p:Lu4/B;

    move/from16 p1, p18

    iput-boolean p1, p0, Lu4/c;->q:Z

    move/from16 p1, p19

    iput-boolean p1, p0, Lu4/c;->r:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, Ls8/n;->R(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lu4/c;->a:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-static {p1, v2, v1}, Ls8/n;->M(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lu4/c;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x3

    .line 20
    invoke-static {p1, v2, v1}, Ls8/n;->N(Landroid/os/Parcel;ILjava/util/List;)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    invoke-static {p1, v1, v1}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 25
    .line 26
    .line 27
    iget-boolean v2, p0, Lu4/c;->c:Z

    .line 28
    .line 29
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x5

    .line 33
    iget-object v3, p0, Lu4/c;->d:Lt4/i;

    .line 34
    .line 35
    invoke-static {p1, v2, v3, p2}, Ls8/n;->L(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 36
    .line 37
    .line 38
    const/4 v2, 0x6

    .line 39
    invoke-static {p1, v2, v1}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 40
    .line 41
    .line 42
    iget-boolean v2, p0, Lu4/c;->e:Z

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x7

    .line 48
    iget-object v3, p0, Lu4/c;->f:Lv4/a;

    .line 49
    .line 50
    invoke-static {p1, v2, v3, p2}, Ls8/n;->L(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 51
    .line 52
    .line 53
    const/16 v2, 0x8

    .line 54
    .line 55
    invoke-static {p1, v2, v1}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 56
    .line 57
    .line 58
    iget-boolean v3, p0, Lu4/c;->g:Z

    .line 59
    .line 60
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 61
    .line 62
    .line 63
    const/16 v3, 0x9

    .line 64
    .line 65
    invoke-static {p1, v3, v2}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 66
    .line 67
    .line 68
    iget-wide v2, p0, Lu4/c;->h:D

    .line 69
    .line 70
    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeDouble(D)V

    .line 71
    .line 72
    .line 73
    const/16 v2, 0xa

    .line 74
    .line 75
    invoke-static {p1, v2, v1}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 76
    .line 77
    .line 78
    iget-boolean v2, p0, Lu4/c;->i:Z

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 81
    .line 82
    .line 83
    const/16 v2, 0xb

    .line 84
    .line 85
    invoke-static {p1, v2, v1}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 86
    .line 87
    .line 88
    iget-boolean v2, p0, Lu4/c;->j:Z

    .line 89
    .line 90
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 91
    .line 92
    .line 93
    const/16 v2, 0xc

    .line 94
    .line 95
    invoke-static {p1, v2, v1}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 96
    .line 97
    .line 98
    iget-boolean v2, p0, Lu4/c;->k:Z

    .line 99
    .line 100
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 101
    .line 102
    .line 103
    iget-object v2, p0, Lu4/c;->l:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const/16 v3, 0xd

    .line 110
    .line 111
    invoke-static {p1, v3, v2}, Ls8/n;->N(Landroid/os/Parcel;ILjava/util/List;)V

    .line 112
    .line 113
    .line 114
    const/16 v2, 0xe

    .line 115
    .line 116
    invoke-static {p1, v2, v1}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 117
    .line 118
    .line 119
    iget-boolean v2, p0, Lu4/c;->m:Z

    .line 120
    .line 121
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 122
    .line 123
    .line 124
    const/16 v2, 0xf

    .line 125
    .line 126
    invoke-static {p1, v2, v1}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 127
    .line 128
    .line 129
    const/4 v2, 0x0

    .line 130
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 131
    .line 132
    .line 133
    const/16 v2, 0x10

    .line 134
    .line 135
    invoke-static {p1, v2, v1}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 136
    .line 137
    .line 138
    iget-boolean v2, p0, Lu4/c;->n:Z

    .line 139
    .line 140
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 141
    .line 142
    .line 143
    const/16 v2, 0x11

    .line 144
    .line 145
    iget-object v3, p0, Lu4/c;->o:Lu4/A;

    .line 146
    .line 147
    invoke-static {p1, v2, v3, p2}, Ls8/n;->L(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 148
    .line 149
    .line 150
    const/16 v2, 0x12

    .line 151
    .line 152
    iget-object v3, p0, Lu4/c;->p:Lu4/B;

    .line 153
    .line 154
    invoke-static {p1, v2, v3, p2}, Ls8/n;->L(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 155
    .line 156
    .line 157
    const/16 p2, 0x13

    .line 158
    .line 159
    invoke-static {p1, p2, v1}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 160
    .line 161
    .line 162
    iget-boolean p2, p0, Lu4/c;->q:Z

    .line 163
    .line 164
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 165
    .line 166
    .line 167
    const/16 p2, 0x14

    .line 168
    .line 169
    invoke-static {p1, p2, v1}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 170
    .line 171
    .line 172
    iget-boolean p2, p0, Lu4/c;->r:Z

    .line 173
    .line 174
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 175
    .line 176
    .line 177
    invoke-static {p1, v0}, Ls8/n;->U(Landroid/os/Parcel;I)V

    .line 178
    .line 179
    .line 180
    return-void
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

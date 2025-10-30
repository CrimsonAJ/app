.class public final synthetic Ld2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld2/f;->a:I

    iput-object p1, p0, Ld2/f;->b:Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Ld2/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Ld2/f;->b:Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->y0()Ld2/K;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p1, p1, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v1, Ld2/I;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    iget-wide v3, p1, Lcom/anilab/domain/model/Movie;->a:J

    .line 33
    .line 34
    invoke-direct {v1, v0, v3, v4, v2}, Ld2/I;-><init>(Ld2/K;JLE7/d;)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    invoke-virtual {v0, p1, v1}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 39
    .line 40
    .line 41
    :cond_0
    sget-object p1, LA7/n;->a:LA7/n;

    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_0
    check-cast p1, LH2/i;

    .line 45
    .line 46
    const-string v0, "it"

    .line 47
    .line 48
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v1, LH2/s;

    .line 52
    .line 53
    iget-object v0, p0, Ld2/f;->b:Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget-object v2, v2, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 60
    .line 61
    iget-object v7, v2, Lcom/anilab/domain/model/Movie;->c:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    iget-object v2, v2, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 68
    .line 69
    iget-object v8, v2, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iget-object v2, v2, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 76
    .line 77
    iget v2, v2, Lcom/anilab/domain/model/Movie;->g:I

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    iget-object v3, v3, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 84
    .line 85
    iget-object v9, v3, Lcom/anilab/domain/model/Movie;->d:Ljava/util/List;

    .line 86
    .line 87
    iget-wide v3, p1, LH2/i;->b:J

    .line 88
    .line 89
    iget-wide v5, p1, LH2/i;->a:J

    .line 90
    .line 91
    invoke-direct/range {v1 .. v9}, LH2/s;-><init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, LM1/B;->t0(LH2/s;)V

    .line 95
    .line 96
    .line 97
    sget-object p1, LA7/n;->a:LA7/n;

    .line 98
    .line 99
    return-object p1

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

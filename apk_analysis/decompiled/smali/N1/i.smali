.class public final synthetic LN1/i;
.super Lkotlin/jvm/internal/g;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, LN1/i;->a:I

    invoke-direct/range {p0 .. p6}, Lkotlin/jvm/internal/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LN1/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const-string v0, "p0"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;->t0()Lk2/m;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v1, v1, Lk2/m;->g:LP2/e;

    .line 28
    .line 29
    iget-object v1, v1, LP2/e;->a:LC2/g0;

    .line 30
    .line 31
    invoke-virtual {v1}, LC2/g0;->b()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    iget-object p1, v0, Li0/v;->v:Li0/v;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    iget-object p1, p1, Li0/v;->v:Li0/v;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object p1, p2

    .line 46
    :goto_0
    instance-of v0, p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    move-object p2, p1

    .line 51
    check-cast p2, Lcom/anilab/android/ui/main/HostFragment;

    .line 52
    .line 53
    :cond_1
    if-eqz p2, :cond_3

    .line 54
    .line 55
    new-instance p1, Lu0/a;

    .line 56
    .line 57
    const v0, 0x7f0a018d

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, v0}, Lu0/a;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, p1}, LM1/n;->j0(Lu0/D;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {v0}, Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;->t0()Lk2/m;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    xor-int/lit8 v2, p2, 0x1

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v1, Lk2/l;

    .line 77
    .line 78
    const/4 v6, 0x0

    .line 79
    iget-wide v4, p1, Lcom/anilab/domain/model/Movie;->a:J

    .line 80
    .line 81
    invoke-direct/range {v1 .. v6}, Lk2/l;-><init>(ZLk2/m;JLE7/d;)V

    .line 82
    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    invoke-virtual {v3, p1, v1}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 86
    .line 87
    .line 88
    :cond_3
    :goto_1
    sget-object p1, LA7/n;->a:LA7/n;

    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_0
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 92
    .line 93
    check-cast p2, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    const-string v0, "p0"

    .line 100
    .line 101
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;

    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->t0()LN1/y;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iget-object v1, v1, LN1/y;->j:LP2/e;

    .line 113
    .line 114
    iget-object v1, v1, LP2/e;->a:LC2/g0;

    .line 115
    .line 116
    invoke-virtual {v1}, LC2/g0;->b()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_4

    .line 121
    .line 122
    new-instance p1, Lu0/a;

    .line 123
    .line 124
    const p2, 0x7f0a018d

    .line 125
    .line 126
    .line 127
    invoke-direct {p1, p2}, Lu0/a;-><init>(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, p1}, LM1/n;->j0(Lu0/D;)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    invoke-virtual {v0}, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;->t0()LN1/y;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    xor-int/lit8 v2, p2, 0x1

    .line 139
    .line 140
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    new-instance v1, LN1/x;

    .line 144
    .line 145
    const/4 v6, 0x0

    .line 146
    iget-wide v4, p1, Lcom/anilab/domain/model/Movie;->a:J

    .line 147
    .line 148
    invoke-direct/range {v1 .. v6}, LN1/x;-><init>(ZLN1/y;JLE7/d;)V

    .line 149
    .line 150
    .line 151
    const/4 p1, 0x0

    .line 152
    invoke-virtual {v3, p1, v1}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 153
    .line 154
    .line 155
    :goto_2
    sget-object p1, LA7/n;->a:LA7/n;

    .line 156
    .line 157
    return-object p1

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

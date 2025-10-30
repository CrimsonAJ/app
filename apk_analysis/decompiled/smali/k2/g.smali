.class public final synthetic Lk2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk2/g;->a:I

    iput-object p1, p0, Lk2/g;->b:Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lk2/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lk2/f;

    .line 7
    .line 8
    iget-object v3, p0, Lk2/g;->b:Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;

    .line 9
    .line 10
    invoke-virtual {v3}, Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;->t0()Lk2/m;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v1, v1, Lk2/m;->g:LP2/e;

    .line 15
    .line 16
    iget-object v1, v1, LP2/e;->a:LC2/g0;

    .line 17
    .line 18
    invoke-virtual {v1}, LC2/g0;->b()Z

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    new-instance v1, LG0/h;

    .line 23
    .line 24
    const-class v4, Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;

    .line 25
    .line 26
    const-string v5, "onItemClick"

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    const-string v6, "onItemClick(Lcom/anilab/domain/model/Movie;)V"

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x7

    .line 33
    invoke-direct/range {v1 .. v8}, LG0/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 34
    .line 35
    .line 36
    move-object v10, v1

    .line 37
    new-instance v1, LN1/i;

    .line 38
    .line 39
    const-class v4, Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;

    .line 40
    .line 41
    const-string v5, "onUpdateWatchList"

    .line 42
    .line 43
    const/4 v2, 0x2

    .line 44
    const-string v6, "onUpdateWatchList(Lcom/anilab/domain/model/Movie;Z)V"

    .line 45
    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v8, 0x1

    .line 48
    invoke-direct/range {v1 .. v8}, LN1/i;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v9, v10, v1}, Lk2/f;-><init>(ZLG0/h;LN1/i;)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_0
    new-instance v0, Lk2/b;

    .line 56
    .line 57
    new-instance v1, LG0/h;

    .line 58
    .line 59
    iget-object v3, p0, Lk2/g;->b:Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;

    .line 60
    .line 61
    const-class v4, Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;

    .line 62
    .line 63
    const-string v5, "onCalendarClick"

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    const-string v6, "onCalendarClick(Lcom/anilab/domain/model/CalendarItem;)V"

    .line 67
    .line 68
    const/4 v7, 0x0

    .line 69
    const/4 v8, 0x6

    .line 70
    invoke-direct/range {v1 .. v8}, LG0/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v0, v1}, Lk2/b;-><init>(LG0/h;)V

    .line 74
    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

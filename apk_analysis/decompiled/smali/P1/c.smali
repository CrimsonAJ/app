.class public final synthetic LP1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LP1/d;

.field public final synthetic c:LH2/c;


# direct methods
.method public synthetic constructor <init>(LH2/c;LP1/d;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LP1/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP1/c;->c:LH2/c;

    iput-object p2, p0, LP1/c;->b:LP1/d;

    return-void
.end method

.method public synthetic constructor <init>(LP1/d;LH2/c;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, LP1/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP1/c;->b:LP1/d;

    iput-object p2, p0, LP1/c;->c:LH2/c;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, LP1/c;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LP1/c;->b:LP1/d;

    .line 7
    .line 8
    iget-object p1, p1, LP1/d;->v:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 9
    .line 10
    iget-object v0, p0, LP1/c;->c:LH2/c;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lcom/anilab/android/ui/comment/CommentListFragment;->v0(LH2/c;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object p1, p0, LP1/c;->c:LH2/c;

    .line 17
    .line 18
    iget-object v0, p1, LH2/c;->j:Ljava/lang/Boolean;

    .line 19
    .line 20
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, LP1/c;->b:LP1/d;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, v1, LP1/d;->v:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lcom/anilab/android/ui/comment/CommentListFragment;->x0(LH2/c;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, v1, LP1/d;->v:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/anilab/android/ui/comment/CommentListFragment;->u0(LH2/c;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.class public final synthetic LQ2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:LQ2/t;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(LQ2/t;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ2/s;->a:LQ2/t;

    iput p2, p0, LQ2/s;->b:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, LQ2/s;->a:LQ2/t;

    .line 2
    .line 3
    iget v0, p1, LQ2/t;->f:I

    .line 4
    .line 5
    iget v1, p0, LQ2/s;->b:I

    .line 6
    .line 7
    iget-object v2, p1, LQ2/t;->g:LQ2/D;

    .line 8
    .line 9
    if-eq v1, v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p1, LQ2/t;->e:[F

    .line 12
    .line 13
    aget p1, p1, v1

    .line 14
    .line 15
    invoke-static {v2, p1}, LQ2/D;->a(LQ2/D;F)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p1, v2, LQ2/D;->I0:Landroid/widget/PopupWindow;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 21
    .line 22
    .line 23
    return-void
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

.class public final synthetic Lq2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/anilab/android/ui/update/CommonErrorDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/update/CommonErrorDialogFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq2/a;->a:I

    iput-object p1, p0, Lq2/a;->b:Lcom/anilab/android/ui/update/CommonErrorDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Lq2/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lq2/a;->b:Lcom/anilab/android/ui/update/CommonErrorDialogFragment;

    .line 7
    .line 8
    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/u1;->A(Li0/v;)Lu0/H;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    const v1, 0x7f0a0194

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v1, v0, v0}, Lu0/H;->j(ILandroid/os/Bundle;Lu0/J;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    :catch_0
    return-void

    .line 20
    :pswitch_0
    iget-object p1, p0, Lq2/a;->b:Lcom/anilab/android/ui/update/CommonErrorDialogFragment;

    .line 21
    .line 22
    :try_start_1
    invoke-virtual {p1}, Li0/v;->k()Li0/y;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    :goto_0
    iget-object v1, p1, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->R0:LY2/r;

    .line 35
    .line 36
    invoke-virtual {v1}, LY2/r;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lq2/c;

    .line 41
    .line 42
    iget-object v1, v1, Lq2/c;->f:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lv4/e;->S(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Li0/v;->d0(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catch_1
    invoke-virtual {p1}, Lcom/anilab/android/ui/update/CommonErrorDialogFragment;->m()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const v0, 0x7f140180

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 68
    .line 69
    .line 70
    :goto_1
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
